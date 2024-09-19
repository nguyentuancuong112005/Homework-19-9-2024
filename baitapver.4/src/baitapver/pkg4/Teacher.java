
package baitapver.pkg4;

import java.util.*;


class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        // Implement method to add a teacher
        System.out.println("Adding teacher: " + fullName);
    }

    @Override
    public void updatePerson(String id) {
        // Implement method to update a teacher
        System.out.println("Updating teacher with ID: " + id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + id + ", Name: " + fullName + ", Department: " + department + ", Subject: " + teachingSubject);
    }
}
