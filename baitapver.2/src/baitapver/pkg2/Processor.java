
package baitapver.pkg2;

import java.util.*;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Cập nhật sinh viên bởi id");
            System.out.println("3. Xoá sinh viên bởi id");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Tìm sinh viên có điểm gpa cao nhất");
            System.out.println("6. Hiển thị sinh viên có học bổng");
            System.out.println("7. Hiển thị tổng học phí của tất cả sinh viên");
            System.out.println("8. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Nhập ID sinh viên:");
                    String studentId = scanner.nextLine();
                    System.out.println("Nhập tên sinh viên:");
                    String studentName = scanner.nextLine();
                    System.out.println("Nhập điểm GPA:");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Nhập ngành học:");
                    String major = scanner.nextLine();
                    Student student = new Student(studentId, studentName, new Date(), gpa, major);
                    studentList.addStudent(student);
                    break;

                case 2:
                    System.out.println("Nhập ID sinh viên cần cập nhật:");
                    String idToUpdate = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentById(idToUpdate);
                    if (studentToUpdate != null) {
                        System.out.println("Nhập điểm GPA mới:");
                        float newGpa = scanner.nextFloat();
                        scanner.nextLine();  // Consume newline
                        studentToUpdate.setGpa(newGpa);
                        System.out.println("Thông tin sinh viên đã cập nhật:");
                        studentToUpdate.displayInfo();
                    } else {
                        System.out.println("Không tìm thấy sinh viên với ID: " + idToUpdate);
                    }
                    break;

                case 3:
                    System.out.println("Nhập ID sinh viên cần xoá:");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Sinh viên có GPA cao nhất là:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("Không có sinh viên nào.");
                    }
                    break;

                case 6:
                    ArrayList<Student> scholarshipStudents = studentList.findScholarshipStudents();
                    if (!scholarshipStudents.isEmpty()) {
                        System.out.println("Các sinh viên có học bổng là:");
                        for (Student s : scholarshipStudents) {
                            s.displayInfo();
                        }
                    } else {
                        System.out.println("Không có sinh viên nào có học bổng.");
                    }
                    break;

                case 7:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Tổng học phí của tất cả sinh viên là: " + totalTuition);
                    break;

                case 8:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Tuỳ chọn không hợp lệ.");
            }
        }
    }
}

