
package baitapver.pkg5;

import java.util.Date;

class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    // Getters và Setters
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
        // Implement add logic here if needed
    }

    @Override
    public void updatePerson(String id) {
        // Implement update logic here if needed
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + id + ", Name: " + fullName + ", Department: " + department + ", Teaching Subject: " + teachingSubject);
        if (isBookOverdue()) {
            System.out.println("Book Status: Overdue");
        } else {
            System.out.println("Book Status: No overdue");
        }
    }
}

