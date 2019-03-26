/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;
import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class ContactsDB {

    Scanner in = new Scanner(System.in);
    private Connection conn;
    private Statement stmt;
    private ResultSet rset;

    public void openDB() {
        try {

            OracleDataSource ods = new OracleDataSource();

            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00139120");
            ods.setPassword("db24Nov97");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void buildContactsTable() {
        try {
            stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE Contacts(id VARCHAR2(25) NOT NULL PRIMARY KEY, name VARCHAR2(40), address VARCHAR2(40),phone_num VARCHAR2(40),email VARCHAR2(40))");

            stmt.execute("INSERT INTO Contacts VALUES('1','Peter','23 Lime Lane','018976543','p.cassidy@b.com')");

            stmt.execute("INSERT INTO Contacts VALUES('2','Donal','2 Shelbbourne rd','012446578','d.oreilly@b.com')");

            stmt.execute("INSERT INTO Contacts VALUES('3','Mary','4 Richmond rd','019887654','m.lawlor@b.com')");

            stmt.execute("INSERT INTO Contacts VALUES('4','Glen','4 Richmond Lane','011223876','g.whelan@b.com')");

            System.out.println("Contacts Table Created");
        } catch (SQLException ex) {
            System.out.println("ERROR: In build Contact" + ex.getMessage());
        }
    }

    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {

            stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE Contacts");
            System.out.println("Contacts table dropped.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
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

    public void queryDB() {

        String sqlStatement1 = "SELECT COUNT(id) FROM Contacts";
        String sqlStatement2 = "SELECT phone_num FROM Contacts WHERE name = 'Peter'";
        String sqlStatement3 = "SELECT id,name FROM Contacts ORDER BY name";
        System.out.println("queryDB Method");

        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sqlStatement1);
            System.out.println("Query 1");
            while(rset.next()){
            System.out.println("The number of contacts in the database is: " + rset.getInt(1));
            }
            rset = stmt.executeQuery(sqlStatement2);
            System.out.println("Query 2");
            while(rset.next()){
            System.out.println("The phone number for Peter is: " + rset.getString(1));
            }
            rset = stmt.executeQuery(sqlStatement3);
            System.out.println("Query 3");
            while (rset.next()) {
                System.out.println(rset.getString(1) + " "
                        + rset.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void showDB() {
        try {
            String sql1 = "SELECT * FROM CONTACTS";
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql1);

            while (rset.next()) {
                System.out.println(rset.getString(1) + " "
                        + rset.getString(2) + " "
                        + rset.getString(3) + " "
                        + rset.getString(4) + " "
                        + rset.getString(5));

            }
        } catch (SQLException e) {
            System.out.println("Error in showDB() method" + e.getMessage());
        }
    }

    public void insert() {
        String id, name, address, phone_num, email;
        System.out.println("Enter ID number");
        id = in.nextLine();
        System.out.println("Enter NAME");
        name = in.nextLine();
        System.out.println("Enter ADDRESS");
        address = in.nextLine();
        System.out.println("Enter PHONE NUMBER");
        phone_num = in.nextLine();
        System.out.println("Enter EMAIL");
        email = in.nextLine();

        String sqlInsert = "INSERT INTO Contacts Values('"
                + id + "','" + name + "','" + address + "','" + phone_num + "','" + email + "')";
        try {
            stmt.executeUpdate(sqlInsert);
            System.out.println("1 row(s) added to the table");
        } catch (SQLException e) {
            System.out.println("Error in insert() method"
                    + e.getMessage());
        }
    }
}
