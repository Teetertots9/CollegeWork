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
            String s2 = "drop sequence eid_seq";
            pstmt = conn.prepareStatement(s2);
            pstmt.executeUpdate();
            System.out.println("Employee Sequence dropped");
        } catch (SQLException ex) {

        }
    }

    public void createEmployeeSequence() {
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
            String s1 = "DROP TABLE Employee13EX1";
            pstmt = conn.prepareStatement(s1);
            pstmt.executeUpdate();
            System.out.println("Employee table dropped");
        } catch (SQLException ex) {

        }

    }

    public void createEmployeetable() {
        // Create a Table           
        try {
            String sql = "CREATE TABLE Employee13EX1 (empid NUMBER PRIMARY KEY "
                    + "NOT NULL,"
                    + "type VARCHAR2(5),"
                    + "name VARCHAR2(40),"
                    + "startDate DATE,"
                    + "salary DECIMAL(8,2),"
                    + "rate DECIMAL(5,2),"
                    + "hours DECIMAL(5,2))";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("SQL Exception creating "
                    + "Employee table" + ex.getMessage());
        }
    }

    public void fillTables() {
        Statement stmt;
        try {
            // Insert data into table
            stmt = conn.createStatement();

            String sql1 = "INSERT INTO Employee13EX1 VALUES "
                    + "(eid_seq.nextVal,'FT','Peter',TO_DATE('2015/01/23','yyyy/mm/dd'),"
                    + "50000, NULL,NULL)";
            stmt.executeUpdate(sql1);
            String sql2 = "INSERT INTO Employee13EX1 VALUES"
                    + " (eid_seq.nextVal,'PT','John',TO_DATE('2015/02/13','yyyy/mm/dd'),"
                    + "NULL, 45,70)";
            stmt.executeUpdate(sql2);
            String sql3 = "INSERT INTO Employee13EX1 VALUES "
                    + "(eid_seq.nextVal,'FT','Mary',TO_DATE('2014/03/16','yyyy/mm/dd'),"
                    + "40000,NULL,NULL)";
            stmt.executeUpdate(sql3);

            String sql4 = "INSERT INTO Employee13EX1 VALUES "
                    + "(eid_seq.nextVal,'PT','Pat',TO_DATE('2014/04/29','yyyy/mm/dd'),"
                    + "NULL,30.5,40)";
            stmt.executeUpdate(sql4);
            String sql5 = "INSERT INTO Employee13EX1 VALUES "
                    + "(eid_seq.nextVal,'FT','Karen',TO_DATE('2014/03/16','yyyy/mm/dd'),"
                    + "65000,NULL,NULL)";
            stmt.executeUpdate(sql5);

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
