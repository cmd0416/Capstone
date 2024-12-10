/*
HEADER COMMENT BLOCK
Author: Christian Davis
Course: COP2210
Date: 11/10/2024
Assignment: Name of Assignment Here
Instructor: Sergio Pisano
Description: A program that calculates a students GPA
 */

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		 // String studentNameParam, int idStudentParam, String courseNameParam, int courseIDParam, int courseCreditsParam, double zyBooksGradeParam, double zyLabsGradeParam, ouble quizzesGradeParam

		
		//For loop to collect data from user for up to numberOfCourses enrollments
		
		//Variables needed for Scanner
		double inputZyBooksGrade, inputZyLabsGrade, inputQuizzesGrade;
		String inputStudentName;
		int inputStudentID, inputCourseCredits, inputNumberOfCourses;
		
		//Variables needed for GPA calculator
		double pointsPerCourseTotal = 0; //Accumulator for points for each course
		double creditsTotal = 0; //Accumulator of credits for all courses
		
		Scanner sc = new Scanner (System.in);
		
		//Assumes I will enter courses for a single student
		System.out.print("Please enter the student name:");
		inputStudentName = sc.nextLine();
		
		System.out.print("Please enter the student ID number:");
		inputStudentID = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter total of courses to include for the GPA calculation:");
		inputNumberOfCourses = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= inputNumberOfCourses; i++ ) {
			
			System.out.print("Please enter course " + (i) + " number of credits:");
			inputCourseCredits = sc.nextInt();
			sc.nextLine();
			System.out.print("Please enter total grade for zyBooks on course " + (i) + ":");
			inputZyBooksGrade = sc.nextDouble();
			sc.nextLine();
			System.out.print("Please enter total grade for zyLabs on course " + (i) + ":");
			inputZyLabsGrade = sc.nextDouble();
			sc.nextLine();
			System.out.print("Please enter total grade for quizzes on course " + (i) + ":");
			inputQuizzesGrade = sc.nextDouble();
			sc.nextLine();
			Enrollment tempEnrollment = new Enrollment(inputStudentName, inputStudentID, "", 0, inputCourseCredits, inputZyBooksGrade, inputZyLabsGrade, inputQuizzesGrade);
			//GPA variables
			creditsTotal += tempEnrollment.enrolledCourse.getCourseCredits();
			pointsPerCourseTotal += tempEnrollment.getPointsPerCourse();
		}
		
		sc.close(); //Closes scanner
		
		//Code to calculate GPA
		double GPA; 
		//Final GPA calculation and display
		System.out.println();
		System.out.println("*** GPA:");
		GPA = pointsPerCourseTotal / creditsTotal;
		System.out.println("The student semester GPA is: " + GPA);
		

		//**
	}

}
