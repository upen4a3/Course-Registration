package allservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ucmo.cs.course.registration.db.RegistrationDB;
import edu.ucmo.cs.course.registration.model.Course;

@WebServlet("/course")
public class CourseServlet extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse resp){

	}


	public void doPost(HttpServletRequest req,HttpServletResponse resp){

		try {
			PrintWriter out = resp.getWriter();
			String term = req.getParameter("term");
			String sem = null;
			int  year = 0;
			String deptName = null;
			if(term != null && !term.equalsIgnoreCase("-1")){
				sem = term.split("-")[0];
				year = Integer.valueOf(term.split("-")[1]);
			}
			deptName = req.getParameter("department");
			DepartmentEnum[] dept = DepartmentEnum.values();
			for(int i =0 ; i<dept.length;i++){
				if(dept[i].getName().equalsIgnoreCase(deptName)){
					deptName = dept[i].getDeptName();
					break;
				}
			}
			String html = "<html>"+
					"<head>"+
					"<style>"+
					"</style>"+
					"</head>"+
					"<body>"+
					"<h1>Courses</h1>"+
					"<table style='border: 1px solid black;'>"+
					"<thead>"+
					"<tr>"+
					"<th style='border: 1px solid black;''>CRN</th>"+
					"<th style='border: 1px solid black;'>CR.Name</th>"+
					"<th style='border: 1px solid black;'>Instructor</th>"+
					"<th style='border: 1px solid black;'>Dept. Name</th>"+
					"<th style='border: 1px solid black;'>Building</th>"+
					"<th style='border: 1px solid black;'>Credits</th>"+
					"</tr>"+
					"</thead>"+
					"<tbody>";


			String htmlone = "</tbody></table></body></html>";

			RegistrationDB rdb = new RegistrationDB();
			List<Course> crsList = rdb.findCourseList(sem, year, deptName,req);
			out.println(html);
			for(Course cr : crsList){
	      	String htmltr = "<tr>"+
				      			"<td style='border: 1px solid black;'>"+cr.getCourseNum()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+cr.getCourseTitle()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+cr.getInstructor()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+cr.getDeptName()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+cr.getBuildingName()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+cr.getCredits()+"</td>"+
				      			"<td style='border: 1px solid black;'>"+
				      				"<a href=newregistration?hiddencrn="+cr.getCourseNum()+">Register</a>"+
				      			"</td>"+
			      		    "</tr>";
	      	out.println(htmltr);
	      };
	      out.println(htmlone);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}
