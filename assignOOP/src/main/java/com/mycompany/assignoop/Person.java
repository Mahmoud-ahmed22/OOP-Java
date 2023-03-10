package com.mycompany.assignoop;

public class Person {
   String firstName;
   String lastName;
   int age;
   String email;
   
    // Setters
   
    public void setFirstName(String fname) {
       firstName = fname;
    }
   
    public void setLastName(String lname) {
        lastName = lname;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Getters
    
    public void getFirstName() {
        System.out.println("First Name: " + firstName);
    }
    
    public void getLastName() {
        System.out.println("Last Name: " + lastName);
    }
    
    public void getAge() {
        System.out.println("Age: " + age);
    }
    
    public void getEmail() {
        System.out.println("Email: " + email);
    }
}