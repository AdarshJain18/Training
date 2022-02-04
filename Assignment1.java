package com.pack;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Welcome to College Management");
		Scanner sc = new Scanner(System.in);
		
		int itr = 0;
		Student studentData = new Student(0, null, 0, 0, 0, 0, 0, null, 0, 0);
		
		while(true) {
			if(itr > 0) {
				System.out.println("C : Check student Result");
			}
			System.out.println("A : Add Student Result\nX : Exit");
			String msg = sc.next();
			if(msg.equalsIgnoreCase("A")) {
				System.out.println("Enter Student id: ");
				studentData.id = sc.nextInt();
				
				System.out.println("Enter Student name: ");
				studentData.name = sc.next();
				
				System.out.println("Note : Enter marks out of 100.");
				System.out.println("Enter Student's marks in hindi: ");
				studentData.hindi = sc.nextInt();
				
				System.out.println("Enter Student's marks in english: ");
				studentData.english = sc.nextInt();
				
				System.out.println("Enter Student's marks in maths: ");
				studentData.maths = sc.nextInt();
				
				System.out.println("Enter Student's marks in science: ");
				studentData.science = sc.nextInt();
				
				System.out.println("Enter Student's marks in social: ");
				studentData.social = sc.nextInt();
				
				studentData.total = studentData.hindi 
						+ studentData.english 
						+ studentData.maths 
						+ studentData.science 
						+ studentData.social;
				
				// studentData.percentage = (float)((studentData.total / 500) * 100);
				
				// studentData = new Student(id, name, hindi, english, maths, science, social);
				// System.out.println(studentData.id);
				System.out.println("Student added succesfully...");
				System.out.println("Do you want to continue (Y/N): ");
				String exit = sc.next();
				if(exit.equalsIgnoreCase("N")) {
					System.out.println("Bye");
					break;
				}
				itr++;
			}
			else if(msg.equalsIgnoreCase("C")) {
				System.out.println("Enter student id to check result: ");
				
				if(studentData.id == sc.nextInt()) {
					if(studentData.total > 249) {
						studentData.result = "Pass";
					}
					else {
						studentData.result = "Fail";
					}
					
					
					System.out.println("Student's ID = " + studentData.id);
					System.out.println("Name = " + studentData.name);
					System.out.println("Student Marks out of 100 = {hindi = " + studentData.hindi 
							+ ", english = " + studentData.english 
							+ ", maths = " + studentData.maths
							+ ", science = " + studentData.science
							+ ",social = " + studentData.social + "}");
					System.out.println("Result Status = " + studentData.result);
					System.out.println("Total = " + studentData.total + "/500");
					System.out.println("Percentage = " + studentData.percentage);
					
				}
				else {
					System.out.println("Student id not found!");
				}
			}
			else {
				System.out.println("Bye");
				break;
				
			}
		}
	}
}

class Student {
	int id;
	String name;
	int hindi;
	int english;
	int maths;
	int science;
	int social;
	String result;
	int total;
	float percentage;
	
	
	public Student(int id, String name, int hindi, int english, int maths, int science, int social, String result,
			int total, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.hindi = hindi;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.result = result;
		this.total = total;
		this.percentage = (this.total / 500) * 100f;
	}
	
	
	
}

class SubjectMarks {
	
}




/*
 * Question :
 * 
 * Welcome to COllege Management 
 * A: Add Student Result 
 * X: Exit 
 * a 
 * Enter student id: 
 * 10 
 * Enter student Name: 
 * durga 
 * Enter marks in hindi: 
 * 1 
 * Enter marks in english: 
 * 1 
 * Enter marks in maths: 
 * 1 
 * Enter marks in science: 
 * 1 
 * Enter marks in social: 
 * 1 
 * Student added successfully.. 
 * Do you want to continue (Y/N): 
 * C: Check student Result 
 * A: Add Student Result 
 * X: Exit 
 * c 
 * Enter student id to check result: 
 * 1 
 * student id not found 
 * Do you want to continue (Y/N): 
 * y 
 * C: Check student Result 
 * A: Add Student Result 
 * X: Exit 
 * c 
 * Enter student id to check result: 
 * 10 
 * Student Result{id='10', name='null', marks=Subject Marks{hindi=1, english=1, maths=1, science=1, social=1}, result='Pass', total=5, percentage=100.0}
 * Do you want to continue (Y/N): 
 * n 
 * Bye
 * 
 * Process finished with exit code 1
 */


