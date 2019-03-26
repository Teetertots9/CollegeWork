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

    public void dropEmployeeTable() {
        System.out.println("Checking for existence of Employee table");
        try {
            String s1 = "DROP TABLE Employee13EX2";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("Employee table dropped");
        } catch (SQLException ex) {

        }

    }
    
    public void dropFTTable() {
        System.out.println("Checking for existence of FullTimeEmployee table");
        try {
            String s1 = "DROP TABLE FULLTIMEEMPLOYEE";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("FullTimeEmployee table dropped");
        } catch (SQLException ex) {

        }

    }
    
    public void dropPTTable() {
        System.out.println("Checking for existence of PartTimeEmployee table");
        try {
            String s1 = "DROP TABLE PARTTIMEEMPLOYEE";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("PartTimeEmployee table dropped");
        } catch (SQLException ex) {

        }

    }

    public void createEmployeetable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE Employee13EX2 (empid NUMBER PRIMARY KEY "
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

    
    public void createFTtable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE FULLTIMEEMPLOYEE (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "salary decimal(10,2),"
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEE13EX2 (EMPID))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

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
                    + "FOREIGN KEY (EMPID) REFERENCES EMPLOYEE13EX2 (EMPID))";

            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

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
            
            String sqlemp1 = "INSERT INTO Employee13EX2 VALUES "
                    + "(empid_seq.nextVal,'FT','Peter',TO_DATE('2015/01/23','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp1);
   
            String sqlft1 = "INSERT INTO FULLTIMEEMPLOYEE VALUES (empid_seq.currVal,50000)";
            stmt.executeUpdate(sqlft1);

            String sqlemp2 = "INSERT INTO Employee13EX2 VALUES "
                    + "(empid_seq.nextVal,'PT','John',TO_DATE('2015/02/13','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp2);
   
            String sqlft2 = "INSERT INTO PARTTIMEEMPLOYEE VALUES (empid_seq.currVal,45,70)";
            stmt.executeUpdate(sqlft2);

            String sqlemp3 = "INSERT INTO Employee13EX2 VALUES "
                    + "(empid_seq.nextVal,'FT','Mary',TO_DATE('2014/03/16','yyyy/mm/dd'))";
            stmt.executeUpdate(sqlemp3);
   
            String sqlft3 = "INSERT INTO FULLTIMEEMPLOYEE VALUES (empid_seq.currVal,40000)";
            stmt.executeUpdate(sqlft3);
            
            String sqlemp4 = "INSERT INTO Employee13EX2 VALUES "
                    + "(empid_seq.nextVal,'PT','Pat',TO_DATE('2014/04/29','yyyy/mm/dd'))";
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlemp4);
   
            String sqlpt1 = "INSERT INTO PARTTIMEEMPLOYEE VALUES (empid_seq.currVal,30.5,40)";
            stmt.executeUpdate(sqlpt1); 

            String sqlemp5 = "INSERT INTO Employee13EX2 VALUES "
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
