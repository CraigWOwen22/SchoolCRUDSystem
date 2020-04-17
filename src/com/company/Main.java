package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChoice;
        System.out.println("Welcome to the CRUD School System ");
        System.out.println("Please choose an option from the list(1, 2, 3, and 4)...\n1.Add a student\n2.Find a student\n3.Update a student\n4.Remove a student");
        userChoice = scan.nextLine();

        Student student;
        switch(userChoice){

            case "1":
//                System.out.println("Please enter students name and press the enter key");
//                String firstName = scan.nextLine();
//                System.out.println("Please enter students name and press the enter key");
//                String secondName = scan.nextLine();
//                System.out.println("Please enter students name and press the enter key");
//                int age = scan.nextInt();
//
//                student = new Student(firstName, secondName, age);
//                student.addStudent();

            case "2":
                //find a student
            case "3":
                //Update a student
                student = new Student();
                System.out.println(student.updateStudent(1, "Craig", "Owen", 29));

            case "4":
                //remove a student
                //
        }



	/*

	switch case
	if add student... instntiate student with default values..then call the add student method.... the add student method will add the student into the database.
	 */
    }
}
