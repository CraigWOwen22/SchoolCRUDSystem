package com.company;

import com.company.Student;

public class StudentTester {

    public static void main(String[] args) {
        Student student1 = new Student("Dion", "Parry", 25);
        System.out.println("Testing student...");
        System.out.println("Expected:");
        System.out.println("first name: 'Dion', second name: 'Parry', age: '25', studentID: '1'");
        System.out.println("Actual:");
        System.out.println("first name: '"+ student1.getFirstName() +"', second name: '" + student1.getSecondName() + "', age: '" + student1.getAge() + "', " + "studentID: " + "'" + Student.studentID + "'");

        Student student2 = new Student("Cheryl", "Jones", 36);
        System.out.println("Testing student...");
        System.out.println("Expected:");
        System.out.println("first name: 'Cheryl', second name: 'Jones', age: '36', studentID: '2'");
        System.out.println("Actual:");
        System.out.println("first name: '"+ student2.getFirstName() +"', second name: '" + student2.getSecondName() + "', age: '" + student2.getAge() + "', " + "studentID: " + "'" + Student.studentID + "'");

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println("..Testing complete.");
    }
}
