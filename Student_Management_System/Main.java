package student_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("===============Student Management System============");
        Scanner s = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        
        while (true) {
            System.out.println("Choose an option:\n1. Add Student\n2. Remove Student\n3. Display All Students\n4. Exit");
            int choice = s.nextInt();
            
            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.removeStudent();
                    break;
                case 3:
                    sms.displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
