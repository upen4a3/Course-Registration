package edu.ucmo.cs.course.registration.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import edu.ucmo.cs.course.registration.model.AlreadyRegisteredException;
import edu.ucmo.cs.course.registration.model.Course;
import edu.ucmo.cs.course.registration.model.LoginBean;
import edu.ucmo.cs.course.registration.model.RegDetails;

public class RegistrationDB implements Serializable {

	private static final long serialVersionUID = 1L;

	public Connection createConnection() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		Class.forName("org.postgresql.Driver");
		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String uName ="postgres";
		String pWord ="smartfan1";
		conn = DriverManager.getConnection(dbUrl,uName,pWord);
		return conn;
	}

	public LoginBean fetchLoginInfo(String username,HttpServletRequest req) throws SQLException, ClassNotFoundException{
		try{	
			LoginBean bean = new LoginBean();
			String sql = "select student_id,password from logininfo where lower(student_id) = ? ";
			PreparedStatement pstmt = createConnection().prepareStatement(sql);
			System.out.println("Query with values bound is   :" + sql);
			pstmt.setString(1,username);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				bean.setUserName(rs.getString("student_id"));
				bean.setPassWord(rs.getString("password"));
			}
			return bean;
		}catch(ClassNotFoundException cnfe){
			throw new ClassNotFoundException();
		}finally{
			if(createConnection() != null){
				createConnection().close();
			}
		}
	}

	public List<Course> findCourseList(final String semester,final int year,final String deptName,HttpServletRequest req) throws SQLException, ClassNotFoundException{
		try{
			List<Course> courseList = new ArrayList<Course>();
			String sql =  "select c.course_id,c.title,c.dept_name,c.credits,dt.building,inst.name "+
					"from course c join teaches th on th.course_id = c.course_id "+ 
					"join department dt on dt.dept_name = c.dept_name "+
					"join instructor inst on inst.dept_name = dt.dept_name "+
					"where th.semester= ? and th.year = ? and c.dept_name = ?";
			PreparedStatement pstmt = createConnection().prepareStatement(sql);
			pstmt.setString(1,semester);
			pstmt.setInt(2,year);
			pstmt.setString(3,deptName);

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Course course = new Course();
				course.setCourseNum(rs.getString("course_id"));
				course.setCourseTitle(rs.getString("title"));
				course.setDeptName(rs.getString("dept_name"));
				course.setBuildingName(rs.getString("building"));
				course.setInstructor(rs.getString("name"));
				course.setCredits(rs.getInt("credits"));
				courseList.add(course);
			}
			return courseList;
		}catch(ClassNotFoundException cnfe){
			throw new ClassNotFoundException();
		}finally{
			if(createConnection() != null){
				createConnection().close();
			}
		}
	}


	public void createNewReg(String courseNum,String userId) throws SQLException, ClassNotFoundException, AlreadyRegisteredException{
		try{	
			// Check already registered or not
			String query = "select * from takes where course_id=?";
			PreparedStatement pstmt = createConnection().prepareStatement(query);
			pstmt.setString(1,courseNum);
			ResultSet rs = pstmt.executeQuery();
			String sectionId = null;
			String semester = null;
			int acedamicYear=0;
			while(rs.next()){
				String crn = rs.getString("course_id");
				String id = rs.getString("student_id");
				if(crn.equalsIgnoreCase(courseNum) && id.equalsIgnoreCase(userId)){
					throw new AlreadyRegisteredException();
				}
			}


			// Get necessary information from DB to update values into takes table
			String sql =  "select sct.sec_id,sct.semester,sct.year "+
					"from section sct join course c on sct.course_id = c.course_id "+ 
					"where sct.course_id = ?";
			PreparedStatement prepStatement = createConnection().prepareStatement(sql);
			prepStatement.setString(1,courseNum);
			ResultSet resultSet = prepStatement.executeQuery();
			while (resultSet.next()){
				sectionId = resultSet.getString("sec_id");
				semester = resultSet.getString("semester");
				acedamicYear = resultSet.getInt("year");
			}

			// Saving registration info
			String saveSql = "insert into takes ( student_id,course_id,sec_id,semester,year,grade ) values (?,?,?,?,?,?)";
			PreparedStatement prestmt = createConnection().prepareStatement(saveSql);
			prestmt.setString(1,userId);
			prestmt.setString(2,courseNum);
			prestmt.setString(3,sectionId);
			prestmt.setString(4,semester);
			prestmt.setInt(5,acedamicYear);
			prestmt.setString(6,"N/A");
			prestmt.executeUpdate();
		}catch(ClassNotFoundException cnfe){
			throw new ClassNotFoundException();
		}finally{
			if(createConnection() != null){
				createConnection().close();
			}
		}
	}
	
	
	public List<RegDetails> findRegisteredCourses(String userId) throws ClassNotFoundException, SQLException{
		List<RegDetails> regDetails = new ArrayList<RegDetails>();
		String query = "select tk.course_id,tk.sec_id,tk.semester,tk.year,sct.building,"+
					   "sct.room_number,inst.name,c.title,c.credits,dt.dept_name "+
				 	   "from takes tk join section sct on sct.sec_id = tk.sec_id join course c on c.course_id = tk.course_id  "+
				 	   "join department dt on c.dept_name = dt.dept_name join instructor inst on inst.dept_name = dt.dept_name "+
				 	   "where tk.student_id=?";
		PreparedStatement prepStmt = createConnection().prepareStatement(query);
		prepStmt.setString(1,userId);
		ResultSet rs = prepStmt.executeQuery();
		while(rs.next()){
			RegDetails regdt = new RegDetails();
			regdt.setCourseNum(rs.getString("course_id"));
			regdt.setSectionId(rs.getString("sec_id"));
			regdt.setSemester(rs.getString("semester"));
			regdt.setBuilding(rs.getString("building"));
			regdt.setYear(rs.getInt("year"));
			regdt.setRoomNumber(rs.getString("room_number"));
			regdt.setInstructorName(rs.getString("name"));
			regdt.setCourseTitle(rs.getString("title"));
			regdt.setDeptName(rs.getString("dept_name"));
			regdt.setCredits(rs.getInt("credits"));
			regDetails.add(regdt);
		}
		return regDetails;
	}
}
