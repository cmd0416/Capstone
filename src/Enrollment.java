
public class Enrollment {

	private double zyBooksGrade; 
	private double zyLabsGrade;
	private double quizzesGrade;
	private double finalGrade; 

	Course enrolledCourse;
	Student enrolledStudent; 
	
	private String finalGradeLetter;
	private double pointsPerCourse;


	Enrollment(String studentNameParam, int idStudentParam, String courseNameParam, int courseIDParam, int courseCreditsParam, double zyBooksGradeParam, double zyLabsGradeParam, double quizzesGradeParam){

		enrolledCourse = new Course(courseNameParam, courseIDParam, courseCreditsParam);
		enrolledStudent = new Student(idStudentParam, studentNameParam);

		zyBooksGrade = zyBooksGradeParam;
		zyLabsGrade = zyLabsGradeParam;
		quizzesGrade = quizzesGradeParam;

		setFinalGrade();
		
		setFinalGradeLetter();
		setPointsPerCourse();

	}


	//Set methods

	public void setZyBooksGrade(double zyBooksGradeParam) {
		zyBooksGrade = zyBooksGradeParam;
	}

	public void setZyLabsGrade(double zyLabsGradeParam) {
		zyLabsGrade = zyLabsGradeParam;
	}

	public void setQuizzesGrade(double quizzesGradeParam) {
		quizzesGrade = quizzesGradeParam;
	}

	//calculates final grade of course taken by student
	public void setFinalGrade() {
		finalGrade = (zyBooksGrade * 0.4) + (zyLabsGrade * 0.4) + (quizzesGrade * 0.2);
	}
	
	public void setFinalGradeLetter() {
		if(finalGrade >= 93) { finalGradeLetter = "A";}
		else if(finalGrade >= 90) { finalGradeLetter = "A-";}
		else if(finalGrade >= 87) { finalGradeLetter = "B+";}
		else if(finalGrade >= 83) { finalGradeLetter = "B";}
		else if(finalGrade >= 80) { finalGradeLetter = "B-";}
		else if(finalGrade >= 77) { finalGradeLetter = "C+";}
		else if(finalGrade >= 70) { finalGradeLetter = "C";}
		else if(finalGrade >= 60) { finalGradeLetter = "D";}
		else { finalGradeLetter = "F";}
	}
	
	public void setPointsPerCourse() {
		if (finalGradeLetter.equals("A")) {pointsPerCourse = (4 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("A-")) {pointsPerCourse = (3.67 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("B+")) {pointsPerCourse = (3.33 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("B")) {pointsPerCourse = (3 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("B-")) {pointsPerCourse = (2.67 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("C+")) {pointsPerCourse = (2.33 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("C")) {pointsPerCourse = (2 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("D")) {pointsPerCourse = (1 * enrolledCourse.getCourseCredits());}
		if (finalGradeLetter.equals("F")) {pointsPerCourse = (0 * enrolledCourse.getCourseCredits());}
	}


	//get methods
	public double getZybooksGrade() {
		return zyBooksGrade;
	}

	public double getZyLabsGrade() {
		return zyLabsGrade; 
	}

	public double getQuizzesGrade() {
		return quizzesGrade;
	}

	public String getFinalGradeLetter() {
		return finalGradeLetter;
	}
	
	public double getPointsPerCourse() {
		return pointsPerCourse;
	}
	
	
	
	public String toString() {
		return ("Student Name: " + enrolledStudent.getStudentName() 
		+ ", Student ID: " + enrolledStudent.getIdStudent() 
		+ ", Course Name: " + enrolledCourse.getCourseName()
		+ ", Course ID: " + enrolledCourse.getCourseID()
		+ ", Course Credits: " + enrolledCourse.getCourseCredits()
		+ ", zyBooks Grade: " + this.zyBooksGrade
		+ ", zyLabs Grade: " + this.zyLabsGrade
		+ ", Quizzes Grades: " + this.quizzesGrade
		+ ", Final Grade: " + this.finalGrade
		+ ", Final Grade Letter: " + this.finalGradeLetter
		+ ", Points Per Course: " + this.pointsPerCourse);
	}
}
