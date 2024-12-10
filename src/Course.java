
public class Course {

	//initiate variables 
	private String courseName; 
	private int courseID;
	private int courseCredits; 
	
	Course (String courseNameParam, int courseIDParam, int courseCreditsParam)
	{
		
		this.courseID = courseIDParam;
		this.courseName = courseNameParam;
		this.courseCredits = courseCreditsParam; 
	}
	
	//Set methods:
	public void setCourseName (String courseNameParam) {
		courseName = courseNameParam; 
	}
	
	public void setCourseID (int courseIDParam) {
		courseID = courseIDParam;
	}
	
	public void setCourseCredits (int courseCreditsParam) {
		courseCredits = courseCreditsParam; 
	}
	
	//Get methods:
	public String getCourseName() {
		return courseName;
	}
	
	public int getCourseID() {
		return courseID;
	}
	
	public int getCourseCredits() {
		return courseCredits;
	}
	
	public String toString() {
		return ("Course name: " + courseName + ", Course ID: " + courseID + ", Course Credits: " + courseCredits);
		
	}
}
