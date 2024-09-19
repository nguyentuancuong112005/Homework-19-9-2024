
package baitapver.pkg1;

import java.util.Scanner;
import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. Update student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find student with highest GPA");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter student name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter GPA:");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter major:");
                    String major = scanner.nextLine();
                    Student student = new Student(studentId, studentName, new Date(), gpa, major);
                    studentList.addStudent(student);
                    break;

                case 2:
                    System.out.println("Enter student ID to update:");
                    String idToUpdate = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentById(idToUpdate);
                    if (studentToUpdate != null) {
                        System.out.println("Enter new GPA:");
                        float newGpa = scanner.nextFloat();
                        scanner.nextLine();  // Consume newline
                        studentToUpdate.setGpa(newGpa);
                        System.out.println("Student information updated:");
                        studentToUpdate.displayInfo();
                    } else {
                        System.out.println("Student not found with ID: " + idToUpdate);
                    }
                    break;

                case 3:
                    System.out.println("Enter student ID to delete:");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

