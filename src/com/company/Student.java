package com.company;

import java.sql.*;



public class Student{

    public static int studentID; //Perhaps make private as it should be confined to class.
    private String firstName;
    private String secondName;
    private int age;

    public Student(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        studentID++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Connection con = null;
    PreparedStatement ps = null;

    public void addStudent(){

        String query = " insert into student (student_name, student_surname, student_age)"
                + " values (?, ?, ?)";

        try{
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(query);
            ps.setString(1,this.firstName);
            ps.setString(2,this.secondName);
            ps.setInt(3,this.age);

            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
        finally {
            sqlCleanup(con,ps);
        }

        System.out.println("Test: firstname: " + this.firstName + " secondname: " + this.secondName + " age: " + this.age);


    }

    public void sqlCleanup(Connection con, PreparedStatement ps){
        try{
            if(con != null){con.close();}
            if(ps != null){ps.close();}
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
    }


    @Override
    public String toString() {
        return "com.company.Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
