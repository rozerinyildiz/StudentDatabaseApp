package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// ask how many new students want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//create n number of new students
		for(int i=0;i<numOfStudents;i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		}
		
		for(int i=0;i<numOfStudents;i++) {
			System.out.println(students[i].showInfo());
		}
	}
}
