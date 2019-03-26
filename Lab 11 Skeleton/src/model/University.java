/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.StudentOperations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class University {

    private String name;
    private ArrayList<Student> slist;
    private ResultSet rset;
    private StudentOperations eo;

    public University(String o, StudentOperations co) {
        this.eo = co;
        name = o;
        slist = new ArrayList<>();
    }

   

    public void removeStudent(int id) {
        int val = findStudent(id);
        if (val == -1) {
            System.out.println("Sorry record not found");
        } else {
            slist.remove(val);
            eo.deleteRecord(id);

        }
    }

    

    public Student getStudent(int i) {
        return slist.get(i);
    }


    public int findStudent(int id) {
        int index = -1;
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public void showStudents() {
        System.out.printf("%10s%20s%25s%25s%n", "Student ID", "Name", "Date Of Birth", "Registration Date");
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
    }
    
    public void fillList(){
        rset = eo.getStudents();
        Student s;
        try{
            while(rset.next()){
                Calendar dob = Calendar.getInstance();
                dob.setTime(rset.getDate(3));
                Calendar sdate = Calendar.getInstance();
                sdate.setTime(rset.getDate(4));
                s = new Student(rset.getInt(1), rset.getString(2), dob, sdate);
                slist.add(s);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR In FillList() Method: " + ex.getMessage());
        }
    }
    public void showStudentAges(){
        System.out.printf("%20s%20s%n", "Student Name", "Student Age");
        for (int i = 0; i < slist.size(); i++) {
            int age = slist.get(i).calcAge(slist.get(i).getDob());
            System.out.printf("%20s%20s%n",slist.get(i).getName(),age);
        }
        
    }
    public void addStudent() {
        rset = eo.getMaxStudent();

        try {
            if (rset.next()) {
                Calendar dob = Calendar.getInstance();
                dob.setTime(rset.getDate(3));
                Calendar rdate = Calendar.getInstance();
                rdate.setTime(rset.getDate(4));
                Student s = new Student(rset.getInt(1), rset.getString(2),
                        dob, rdate);
                slist.add(s);
            }

        } catch (SQLException e) {
            System.out.println("Error in addEmployee() method" + e.getMessage());
        }
    }
    public void showLateRegistration(){
        Calendar lateDate = Calendar.getInstance();
                    lateDate.set(2018, 8, 14);
        long min = lateDate.getTimeInMillis(); 
        System.out.printf("%20s%20s%n", "Student Name", "Start Date");
        for (int i = 0; i < slist.size(); i++) {
            long millisRelease = slist.get(i).getRdate().getTimeInMillis();
            if (millisRelease > min) {
                System.out.printf("%1$20s %2$12tb %2$td %2$tY%n",
                slist.get(i).getName(),
                slist.get(i).getRdate());
            }
        }       
    }
}
