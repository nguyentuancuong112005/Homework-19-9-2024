/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapver.pkg5;

import java.util.Date;

class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float gpa, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    // Getters và Setters
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
        System.out.println("Student ID: " + id + ", Name: " + fullName + ", GPA: " + gpa + ", Major: " + major);
        if (isBookOverdue()) {
            System.out.println("Book Status: Overdue");
        } else {
            System.out.println("Book Status: No overdue");
        }
    }
}

