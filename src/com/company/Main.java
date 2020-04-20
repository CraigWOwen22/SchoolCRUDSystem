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
        int studentID = 0;
        String firstName="", secondName="";
        int age = 0;
        switch(userChoice){

            case "1":
                System.out.println("Please enter students name and press the enter key");
                firstName = scan.nextLine();
                System.out.println("Please enter students name and press the enter key");
                secondName = scan.nextLine();
                System.out.println("Please enter students name and press the enter key");
                age = scan.nextInt();
                student = new Student(firstName, secondName, age);
                student.addStudent();

             case "2":
                 System.out.println("Please enter students ID");
                 studentID = scan.nextInt();
                 student = new Student();
                 student.searchStudent(studentID);

            case "3":
                System.out.println("Please enter students ID of which you would like to updated.");
                studentID = scan.nextInt();
                scan.nextLine();//Line added to consume the \n of above as the next int only consumes the int part of the line.

                System.out.println("Please enter the new details of the student. Press enter to skip...");
                System.out.println("Please enter the students new first name. Press enter to skip...");
                firstName = scan.nextLine();

                System.out.println("Please enter the students new second name. Press enter to skip...");
                secondName = scan.nextLine();

                System.out.println("Please enter the students new age. Enter '0' to skip");
                age = scan.nextInt();

                student = new Student();
                student.updateStudent(studentID, firstName, secondName, age);


//                System.out.println(student.updateStudent(1, "Craig", "Owen", 29));

            case "4":
                System.out.println("Please enter students ID of which you would like to remove.");
                studentID = scan.nextInt();

                student = new Student();
                student.removeStudent(studentID);
        }



	/*

	switch case
	if add student... instntiate student with default values..then call the add student method.... the add student method will add the student into the database.
	 */
    }
}
