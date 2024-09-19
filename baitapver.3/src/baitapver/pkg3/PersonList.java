/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapver.pkg3;

import java.util.*;

class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    // Thêm sinh viên
    public void addStudent(Student student) {
        personList.add(student);
        System.out.println("Student added: " + student.getFullName());
    }

    // Thêm giáo viên
    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
        System.out.println("Teacher added: " + teacher.getFullName());
    }

    // Cập nhật thông tin theo ID
    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.displayInfo();  // Cập nhật logic theo yêu cầu
                return;
            }
        }
        System.out.println("Person with ID: " + id + " not found.");
    }

    // Xóa người theo ID
    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
        System.out.println("Deleted person with ID: " + id);
    }

    // Tìm người theo ID
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    // Hiển thị tất cả mọi người
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    // Tìm sinh viên có GPA cao nhất
    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    // Tìm giáo viên theo khoa
    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}

