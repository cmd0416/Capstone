
public class Student {

	private int idStudent; 
	private String studentName; 
	
	
	Student (int idStudentParam, String studentNameParam){
		this.idStudent = idStudentParam;
		this.studentName = studentNameParam;
	}
	
	//SET METHODS:
	public void setIdStudent(int idStudentParam) {
		idStudent = idStudentParam;
	}
	
	public void setStudentName(String studentNameParam) {
		studentName = studentNameParam;
	}
	
	//get methods:
	public int getIdStudent() {
		return idStudent;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String toString() {
		return ("Student name: " + studentName + ", Student ID: " + idStudent);
	}
}
