/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author x00139120
 */
public class EmployeeOperations {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rset;

    public Connection openDB() {
        try {
            OracleDataSource ods = new OracleDataSource();

            // Tallaght
            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00139120");
            ods.setPassword("db24Nov97");
            // Home Oracle XE
            //ods.setURL("jdbc:oracle:thin:HR/pmagee@localhost:1521:XE");
            // ods.setUser("hr");
            // ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e.getMessage());
        }
        return conn;
    }

    public void dropEmployeeSequence() {
        try {
            String s2 = "drop sequence empid_seq";
            pstmt = conn.prepareStatement(s2);
            pstmt.executeUpdate();
            System.out.println("Employee Sequence dropped");
        } catch (SQLException ex) {

        }
    }

    public void createEmployeeSequence() {
        try {
            String createseq1 = "create sequence empid_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq1);
            pstmt.executeUpdate();
            System.out.println("Employee Sequence created");
        } catch (SQLException ex) {
            System.out.print("Problem with Employee Sequence " + ex.getMessage());
        }
    }
    
    public void dropContactSequence() {
        try {
            String s2 = "drop sequence cid_seq";
            pstmt = conn.prepareStatement(s2);
            pstmt.executeUpdate();
            System.out.println("CONTACT Sequence dropped");
        } catch (SQLException ex) {

        }
    }

    public void createContactSequence() {
        // Creating a sequence    
        try {
            String createseq1 = "create sequence cid_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq1);
            pstmt.executeUpdate();
            System.out.println("CONTACT Sequence created");
        } catch (SQLException ex) {
            System.out.print("Problem with CONTACT Sequence " + ex.getMessage());
        }

    }

    public void dropEmployeeTable() {
        System.out.println("Checking for existence of Employee table");
        try {
            String s1 = "DROP TABLE Employee14 cascade constraints";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("Employee table dropped");
        } catch (SQLException ex) {

        }

    }
    
    public void dropContactTable() {
        System.out.println("Checking for existence of CONTACT table");
        try {
            String s1 = "DROP TABLE CONTACT cascade constraints";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("CONTACT table dropped");
        } catch (SQLException ex) {

        }
    }
    
    public void dropFTTable() {
        System.out.println("Checking for existence of FullTimeEmployee table");
        try {
            String s1 = "DROP TABLE FULLTIMEEMPLOYEE cascade constraints";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("FullTimeEmployee table dropped");
        } catch (SQLException ex) {

        }

    }
    
    public void dropPTTable() {
        System.out.println("Checking for existence of PartTimeEmployee table");
        try {
            String s1 = "DROP TABLE PARTTIMEEMPLOYEE cascade constraints";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("PartTimeEmployee table dropped");
        } catch (SQLException ex) {

        }

    }

    public void createEmployeetable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE Employee14 (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "type VARCHAR2(5),"
                    + "name VARCHAR2(40),"
                    + "startDate DATE)";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
System.out.println("Employee14 Table Created");
        } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "Employee table" + ex.getMessage());
        }
    }
    
    public void createContactTable(){
        try {
            String sql = "CREATE TABLE Contact (cid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "cname VARCHAR2(40),"
                    + "address VARCHAR2(40),"
                    + "phone VARCHAR2(15),"
                    + "email VARCHAR2(40),"
                    + "empid NUMBER,"
                    + "FOREIGN KEY(empid) references Employee14(empid))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println("Contact Table Created");
        } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "Contact table" + ex.getMessage());
        }
    }

    
    public void createFTtable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE FULLTIMEEMPLOYEE (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "salary decimal(10,2),"
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEE14 (EMPID))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
System.out.println("FT Table Created");
        } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "FULLTIMEEMPLOYEE table" + ex.getMessage());
        }
    }
    
    public void createPTtable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE PARTTIMEEMPLOYEE   (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "rate decimal(10,2),"
                    + "hours decimal(10,2),"
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEE14 (EMPID))";

            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
System.out.println("PT Table Created");
        } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "PARTTIMEEMPLOYEE table" + ex.getMessage());
        }
    }


    public void fillTables(){
        Statement stmt;
        try{
            // Insert data into table
            stmt = conn.createStatement();
            
            String sqlemp1 = "INSERT INTO Employee14 VALUES "
                    + "(empid_seq.nextVal,'FT','Peter',TO_DATE('2015/01/23','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp1);
   
            String sqlft1 = "INSERT INTO FULLTIMEEMPLOYEE VALUES (empid_seq.currVal,50000)";
            stmt.executeUpdate(sqlft1);
            
            String sqlc1 = "INSERT INTO CONTACT VALUES (cid_seq.nextVal,'Mary','2 Grafton St','0876545678','mary@grafton.com',empid_seq.currVal)";
            stmt.executeUpdate(sqlc1);

            String sqlemp2 = "INSERT INTO Employee14 VALUES "
                    + "(empid_seq.nextVal,'PT','John',TO_DATE('2015/02/13','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp2);
   
            String sqlft2 = "INSERT INTO PARTTIMEEMPLOYEE VALUES (empid_seq.currVal,45,70)";
            stmt.executeUpdate(sqlft2);
            
            String sqlc2 = "INSERT INTO CONTACT VALUES (cid_seq.nextVal,'Ella','2 Jones St','0865432345','ella@jones.com',empid_seq.currVal)";
            stmt.executeUpdate(sqlc2);

            String sqlemp3 = "INSERT INTO Employee14 VALUES "
                    + "(empid_seq.nextVal,'FT','Mary',TO_DATE('2014/03/16','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp3);
   
            String sqlft3 = "INSERT INTO FULLTIMEEMPLOYEE VALUES (empid_seq.currVal,40000)";
            stmt.executeUpdate(sqlft3);
            
            String sqlc3 = "INSERT INTO CONTACT VALUES (cid_seq.nextVal,'Seamus','12 Henry St','0879876543','seamy@henry.com',empid_seq.currVal)";
            stmt.executeUpdate(sqlc3);
            
            String sqlemp4 = "INSERT INTO Employee14 VALUES "
                    + "(empid_seq.nextVal,'PT','Pat',TO_DATE('2014/04/29','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlemp4);
   
            String sqlpt1 = "INSERT INTO PARTTIMEEMPLOYEE VALUES (empid_seq.currVal,30.5,40)";
            stmt.executeUpdate(sqlpt1); 

            String sqlemp5 = "INSERT INTO Employee14 VALUES "
                    + "(empid_seq.nextVal,'FT','Karen',TO_DATE('2014/04/29','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp5);
   
            String sqlft4 = "INSERT INTO FULLTIMEEMPLOYEE VALUES (empid_seq.currVal,65000)";
            stmt.executeUpdate(sqlft4);
            
            System.out.println("Employee table populated");
        } catch (SQLException ex) {
            System.out.println("SQL Exception inserting values into "
                    + "Employee table" + ex.getMessage());
        }
    }


    public void closeDB() {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (rset != null) {
                rset.close();
            }
            if (conn != null) {
                conn.close();
                System.out.print("Connection closed");
            }

        } catch (SQLException e) {
            System.out.print("Could not close connection ");
        }
    }
}
