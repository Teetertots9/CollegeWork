/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inClassExerciseFriday;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.*;

/**
 *
 * @author x00139120
 */
public class StudentDB {

    private Connection conn;
    private Statement stmt;
    private ResultSet rset;
    private PreparedStatement pstmt;

    public void openDB() {
        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00139120");
            ods.setPassword("db24Nov97");
            // ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            //ods.setUser("hr");
            //ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            stmt = conn.createStatement();

            try {
                // Drop the Coffee table.
                stmt.execute("DROP TABLE Student");
                System.out.println("Student table dropped.");
            } catch (SQLException ex) {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void buildStudentTable() {
        try {
            String sql1 = "CREATE TABLE STUDENT"
                    + "(id NUMBER PRIMARY KEY NOT NULL,"
                    + "name VARCHAR2(40),age NUMBER)";

            stmt = conn.createStatement();
            stmt.executeUpdate(sql1);

            String sql2 = "INSERT INTO STUDENT VALUE(?,?,?)";
            pstmt = conn.prepareStatement(sql2);
            
            pstmt.setInt(1,1);
            pstmt.setString(2,"John");
            pstmt.setInt(3,23);
            pstmt.executeUpdate();
            
            pstmt.setInt(1,2);
            pstmt.setString(2,"Paul");
            pstmt.setInt(3,18);
            pstmt.executeUpdate();
            
            pstmt.setInt(1,3);
            pstmt.setString(2,"Mary");
            pstmt.setInt(3,19);
            pstmt.executeUpdate();
            
            pstmt.setInt(1,4);
            pstmt.setString(2,"Ken");
            pstmt.setInt(3,43);
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error in buildStudentTable() method");
        }
    }

    public void showDB() {
        try {
            String sql1 = "SELECT * FROM STUDENT";
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql1);

            while (rset.next()) {
                System.out.println(rset.getInt(1) + " "
                        + rset.getString(2) + " "
                        + rset.getInt(3));

            }
        } catch (SQLException e) {
            System.out.println("Error in showDB() method");
        }
    }

    public void insert(int id, String name, int age) {
        try {
            String sql1 = "INSERT INTO STUDENT(id,name,age)"
                    + "VALUES(" + id + ",'" + name + "'," + age + ")";
            pstmt = conn.prepareStatement(sql1);
            pstmt.executeUpdate();
            
            
            String sql2 = "INSERT INTO STUDENT VALUE(?,?,?)";
            pstmt = conn.prepareStatement(sql2);
            
            
        } catch (SQLException e) {
            System.out.println("Error in insert() method"
                    + e.getMessage());
        }
    }

    public void closeDB() {
        try {
            stmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
