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
            String s1 = "DROP TABLE Employee2";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("Employee table dropped");
        } catch (SQLException ex) {
            
        }

    }
    public void createEmployeetable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE Employee2 (id NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "type VARCHAR2(5),"
                    + "name VARCHAR2(40),"
                    + "startDate DATE,"
                    + "cproject VARCHAR2(30),"
                    + "expertise VARCHAR2(30))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            
             } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "Employee table" + ex.getMessage());
        }
    }

    public void fillEmployeeTable(){
        try{
            // Insert data into table
            String sql = "INSERT INTO Employee2(id,type,name,startDate,cproject,expertise) "
                    + "values(eid_seq.nextVal,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,"PM");
            pstmt.setString(2,"Peter");
            pstmt.setDate(3,Date.valueOf("2015-01-23"));
            pstmt.setString(4,"Roads");
            pstmt.setString(5, null);
            pstmt.executeUpdate();
            
            pstmt.setString(1,"PM");
            pstmt.setString(2,"John");
            pstmt.setDate(3,Date.valueOf("2015-02-13"));
            pstmt.setString(4,"Roads");
            pstmt.setString(5, null);
            pstmt.executeUpdate();

            pstmt.setString(1,"PM");
            pstmt.setString(2,"Mary");
            pstmt.setDate(3,Date.valueOf("2014-03-16"));
            pstmt.setString(4,"Buildings");
            pstmt.setString(5, null);
            pstmt.executeUpdate();
            
            pstmt.setString(1,"T");
            pstmt.setString(2,"Pat");
            pstmt.setDate(3,Date.valueOf("2014-04-29"));
            pstmt.setString(4,null);
            pstmt.setString(5, "Networking");
            pstmt.executeUpdate();
            
            pstmt.setString(1,"T");
            pstmt.setString(2,"Karen");
            pstmt.setDate(3,Date.valueOf("2014-05-06"));
            pstmt.setString(4,null);
            pstmt.setString(5, "Networking");
            pstmt.executeUpdate();
         

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
