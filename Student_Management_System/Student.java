package student_Management_System;

public class Student {
	    String name;
	    String rollNumber;
	    String grade;

	    public Student(String name, String rollNumber, String grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name +"\n"+"Roll Number: " + rollNumber + "\n"+"Grade: " + grade+"\n";  
	    }
	}



