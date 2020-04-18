package com.company;

import java.sql.*;



public class Student{

    public static int studentID; //Perhaps make private as it should be confined to class.
    private String firstName;
    private String secondName;
    private int age;

    public Student(){

    }

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

    //Add a student
    /*public void addStudent(){

        String query = " insert into student (student_ID, student_name, student_surname, student_age)"
               + " values (?, ?, ?, ?)";

        try{
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(query);
            ps.setInt(1,studentID);
            ps.setString(2,this.firstName);
            ps.setString(3,this.secondName);
            ps.setInt(4,this.age);

            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
        finally {
            sqlCleanup(con,ps);
        }

        System.out.println("Test: firstname: " + this.firstName + " secondname: " + this.secondName + " age: " + this.age);
    }*/

    //Search for a Student
   /* public String searchStudent(int studentID){

        String query = " SELECT * FROM student WHERE student_ID = ?";
        String fName = "";
        String sName = "";
        int age = 0;

        try{
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(query);
            ps.setInt(1,studentID);

            ResultSet result = ps.executeQuery();
            fName = result.getString("student_name");
            sName = result.getString("student_surname");
            age = result.getInt("student_age");
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
        finally {
            sqlCleanup(con,ps);
        }

        return "FirstName: " + fName + "SecondName: " + sName + "Age: " + age;

    }*/

    //Update a Student
   /* public String updateStudent(int userID, String firstName, String surname, int age){

//        String query = "UPDATE student SET student_name = '?', student_surname = '?', student_age = '?' WHERE student_ID = ?";
//
        StringBuilder query = new StringBuilder();

        int parCount = 0;
        boolean inFN = false;
        boolean inSN = false;
        boolean inAge = false;

        query.append("UPDATE student SET ");
        if (firstName != ""){query.append("student_name = '?', "); parCount++; inFN = true;}
        if (surname != ""){query.append("student_surname = '?', "); parCount++; inSN = true;}
        if (age != 0){query.append("student_age = '?', "); parCount++; inAge = true;}
        query.setLength(Math.max(query.length() - 2, 0));
        query.append(" WHERE student_ID = ?");

        try{
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(query.toString());
            for(int i = 1; i <= parCount; i++){
                if(inFN){ps.setString(i,firstName);}
                if(inSN){ps.setString(i,surname);}
                if(inAge){ps.setInt(i,age);}
            }

            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
        finally {
            sqlCleanup(con,ps);
        }

        return "Student added to DB";

    }*/

    //Remove a student
    public String removeStudent(int studentID){
        String query = "DELETE FROM student WHERE student_ID = ?";

        try{
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(query);
            ps.setInt(1,studentID);

            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Exception: " + e);
        }
        finally {
            sqlCleanup(con,ps);
        }
        //possibly add a check to see if student was deletete
        return "Student deleted";
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
