/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignoop;

public class Student extends Person{
    
    int studentId;
    // Setter
    public void setStudentId(int id) {
        this.studentId = id;
    }
    // Getter
    public void getStudentId() {
        System.out.println("Student ID: " + studentId);
    }
}
