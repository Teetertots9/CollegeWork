/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class CreateContactsDB {

    private Connection conn;
    private ResultSet rset;
    private PreparedStatement pstmt;

    public void openDB() {
        try {
            OracleDataSource ods = new OracleDataSource();

            // Tallaght
            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00139120");
            ods.setPassword("db24Nov97");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (Exception e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void dropSequence() {
        String s1 = "drop sequence cid_seq";
        System.out.println("Checking for existing sequences.");

        try {
            pstmt = conn.prepareStatement(s1);
            // Drop the Contacts table.
            pstmt.execute();
            System.out.println("Sequence dropped.");
        } catch (SQLException ex) {
            // No need to report an error.
            // The sequence simply did not exist.
        }
    }
    
    public void CreateContactSequence() {
        try {
            String createseq1 = "create sequence cid_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq1);
            pstmt.executeUpdate();
            System.out.println("Contact Sequence created");
        } catch (SQLException ex) {
            System.out.print("Problem with Contact Sequence " + ex.getMessage());
        }
    }

    public void dropTable() {
        String s1 = "DROP TABLE Contacts";
        System.out.println("Checking for existing tables.");

        try {
            pstmt = conn.prepareStatement(s1);
            // Drop the Contacts table.
            pstmt.execute();
            System.out.println("Album table dropped.");
        } catch (SQLException ex) {
            // No need to report an error.
            // The table simply did not exist.
        }
    }

    public void CreateContactsTable() {
        try {

            // Create a Table
            String create = "CREATE TABLE Contacts"
                    + "(id NUMBER PRIMARY KEY, name VARCHAR2(40), address VARCHAR2(30),pnumber varchar(15), email varchar(30))";
            pstmt = conn.prepareStatement(create);
            pstmt.executeUpdate();
            System.out.println("Table Created");

            String createseq = "create sequence cid_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq);
            pstmt.executeUpdate();
            System.out.println("Sequence Created");

        } catch (SQLException e) {
            System.out.print("SQL Exception here" + e);
            System.exit(1);
        }
    }

    public void closeDB() {
        try {
            pstmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.print("Could not close connection ");
        }
    }

    public static void main(String[] args) {
        CreateContactsDB co = new CreateContactsDB();
        co.openDB();
        co.dropSequence();
        co.dropTable();
        co.CreateContactSequence();
        co.CreateContactsTable();
        co.closeDB();
    }
}
