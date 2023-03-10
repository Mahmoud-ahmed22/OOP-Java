/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignoop;

/**
 *
 * @author Mahmoud
 */
public class GraduateStudent extends Student{
    String projectTitle;
    //Setter
    public void setProjectTitle(String projectName) {
        projectTitle = projectName;
    }
    // Getter
    public void getProjectTitle() {
        System.out.println("Project Title: " + projectTitle);
    }
}
