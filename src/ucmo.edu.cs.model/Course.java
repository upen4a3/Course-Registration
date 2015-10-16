package edu.ucmo.cs.course.registration.model;

import java.io.Serializable;

public class Course implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String courseNum;
	private String courseTitle;
	private String instructor;
	private String deptName;
	private String buildingName;
	private int credits;
	
	
	/**
	 * @return the courseNum
	 */
	public String getCourseNum() {
		return courseNum;
	}
	/**
	 * @param courseNum the courseNum to set
	 */
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}
	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

}
