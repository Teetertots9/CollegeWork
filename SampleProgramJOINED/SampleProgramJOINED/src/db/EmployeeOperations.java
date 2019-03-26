/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.Calendar;
import oracle.jdbc.pool.OracleDataSource;


public class EmployeeOperations {
    private Connection conn;
    private PreparedStatement pstmt;

    // This method opens a connection to the Oracle database
    public Connection openDB() {
        try {
            OracleDataSource ods = new OracleDataSource();

            // Tallaght
//             ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
//             ods.setUser("pmagee");
//             ods.setPassword("tupulo");
            // Home Oracle XE
            ods.setURL("jdbc:oracle:thin:HR/pmagee@localhost:1521:XE");
            ods.setUser("hr");
            ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e.getMessage());
        }
        return conn;
    }

     public void dropEmployeeSequence() {
        try {
            String s2 = "drop sequence eid_seq";
            pstmt = conn.prepareStatement(s2);
            pstmt.executeUpdate();
            System.out.println("Employee Sequence dropped");
        } catch (SQLException ex) {
            
        }
    }

    public void createEmployeeSequence() {
        // Creating a sequence    
        try {
            String createseq1 = "create sequence eid_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq1);
            pstmt.executeUpdate();
            System.out.println("Employee Sequence created");
        } catch (SQLException ex) {
            System.out.print("Problem with Employee Sequence " + ex.getMessage());
        }

    }

    public void dropEmployeeTable() {
        System.out.println("Checking for existence of Employee table");
        try {
            String s1 = "DROP TABLE EmployeeJ";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("Employee table dropped");
        } catch (SQLException ex) {
            
        }
    }
        public void dropTTable() {
        System.out.println("Checking for existence of TECHNICIAN  table");
        try {
            String s1 = "DROP TABLE TECHNICIAN ";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("TECHNICIAN  table dropped");
        } catch (SQLException ex) {
            
        }
    }
            public void dropPMTable() {
        System.out.println("Checking for existence of PROJECTMANAGER  table");
        try {
            String s1 = "DROP TABLE PROJECTMANAGER ";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("PROJECTMANAGER  table dropped");
        } catch (SQLException ex) {
            
        }
    }
    public void createEmployeetable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE EmployeeJ (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "type VARCHAR2(5),"
                    + "name VARCHAR2(40),"
                    + "startDate DATE)";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            
             } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "Employee table" + ex.getMessage());
        }
    }
        public void createTtable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE TECHNICIAN(empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "expertise VARCHAR2(30),"
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEEJ (EMPID))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            
             } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "TECHNICIAN table" + ex.getMessage());
        }
    }
            public void createPMtable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE PROJECTMANAGER  (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "cproject VARCHAR2(30),"
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEEJ (EMPID))";

            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            
             } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "PROJECTMANAGER table" + ex.getMessage());
        }
    }

    public void fillTables(){
        Statement stmt;
        try{
            // Insert data into table

            String sql1 = "INSERT INTO EmployeeJ VALUES (eid_seq.nextVal,'PM','Peter',TO_DATE('2015/01/23','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
   
            String sql11 = "INSERT INTO PROJECTMANAGER VALUES (eid_seq.currVal,'Roads')";
            stmt.executeUpdate(sql11);

            String sql2 = "INSERT INTO EmployeeJ VALUES (eid_seq.nextVal,'PM','John',TO_DATE('2015/02/13','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql2);
   
            String sql21 = "INSERT INTO PROJECTMANAGER VALUES (eid_seq.currVal,'Roads')";
            stmt.executeUpdate(sql21);

            String sql3 = "INSERT INTO EmployeeJ VALUES (eid_seq.nextVal,'PM','Mary',TO_DATE('2014/03/16','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql2);
   
            String sql31 = "INSERT INTO PROJECTMANAGER VALUES (eid_seq.currVal,'Buildings')";
            stmt.executeUpdate(sql21);

            String sql4 = "INSERT INTO EmployeeJ VALUES (eid_seq.nextVal,'T','Pat',TO_DATE('2014/04/29','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql4);
   
            String sql41 = "INSERT INTO TECHNICIAN VALUES (eid_seq.currVal,'Networking')";
            stmt.executeUpdate(sql41); 
            
            System.out.println("Employee table populated");
        } catch (SQLException ex) {
            System.out.println("SQL Exception inserting values into "
                    + "Employee table" + ex.getMessage());
        }
    }
     public void closeDB() {
        try {
            pstmt.close();
            conn.close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            System.out.println("Could not close connection "+ ex.getMessage());
        }
    }
}
