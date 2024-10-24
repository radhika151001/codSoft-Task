package student_Management_System;	

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class StudentManagementSystem {
	    List<Student> studentList = new ArrayList<>();
	    
	    public void addStudent() {
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("Enter student name:");
	        String name = s.nextLine();
	        
	        System.out.println("Enter roll number:");
	        String rollNumber = s.nextLine();
	        
	        System.out.println("Enter grade:");
	        String grade = s.nextLine();
	        
	        studentList.add(new Student(name, rollNumber, grade));
	        System.out.println("============Student added successfully!============");
	    }
	    
	    public void removeStudent() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter roll number of the student to remove:");
	        String rollNumber = scanner.nextLine();
	        
	        boolean found = false;
	        for (Student student : studentList) {
	            if (student.rollNumber.equals(rollNumber)) {
	                studentList.remove(student);
	                System.out.println("============Student removed successfully!============");
	                found = true;
	                break;
	            }
	        }
	        
	        if (!found) {
	            System.out.println("No student found with the provided roll number.");
	        }
	    }
	    
	    public void displayAllStudents() {
	        if (studentList.isEmpty()) {
	            System.out.println("No students available.");
	        } else {
	            System.out.println("List of Students:");
	            System.out.println("====================================");
	            for (Student student : studentList) {
	                System.out.println(student);
	                System.out.println("====================================");
	            }
	        }
	    }
	}


