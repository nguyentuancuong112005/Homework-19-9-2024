
package baitapver.pkg2;

import java.util.ArrayList;


class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    // Thêm sinh viên
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added: " + student.getFullName());
    }

    // Xoá sinh viên bởi ID
    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
        System.out.println("Deleted student with ID: " + id);
    }

    // Tìm sinh viên bởi ID
    public Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Hiển thị tất cả sinh viên
    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    // Tìm sinh viên có GPA cao nhất
    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    // Tìm sinh viên có học bổng
    public ArrayList<Student> findScholarshipStudents() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.hasScholarship()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;
    }

    // Tính tổng học phí của tất cả sinh viên
    public double calculateTuitionOfAllStudents() {
        double totalTuition = 0;
        for (Student student : studentList) {
            totalTuition += student.calculateTuition();
        }
        return totalTuition;
    }
}

