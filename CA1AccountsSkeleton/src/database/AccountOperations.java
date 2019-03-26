package database;

import java.sql.*;
import java.util.Calendar;

import oracle.jdbc.pool.OracleDataSource;

public class AccountOperations {

    private Connection conn;
    private ResultSet rset;
    private PreparedStatement pstmt;

    public Connection openDB() {
        try {
            OracleDataSource ods = new OracleDataSource();

            // Tallaght
            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00139120");
            ods.setPassword("db24Nov97");
            // Home Oracle XE
//            ods.setURL("jdbc:oracle:thin:HR/pmagee@localhost:1521:XE");
//            ods.setUser("hr");
//            ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
        return conn;
    }

    public void dropAccSeq() {
        try {
            // Dropping a sequence
            String dropseq = "drop sequence acc_seq";
            pstmt = conn.prepareStatement(dropseq);
            pstmt.executeUpdate();

        } catch (SQLException e1) {
        }
    }
    // Dropping a Table

    public void dropAccountsTable() {
        try {
            String drop = "DROP TABLE Accounts";
            pstmt = conn.prepareStatement(drop);
            pstmt.executeUpdate();
        } catch (SQLException e1) {
        }
    }

    public void createAccountsTable() {
        try {
            // Create a Table
            String create = "CREATE TABLE Accounts "
                    + "(accno NUMBER PRIMARY KEY, accType VARCHAR2(5), "
                    + "fname VARCHAR2(40), lname VARCHAR2(30), "
                    + "balance DECIMAL(9,2), "
                    + "dateOpened DATE)";
            pstmt = conn.prepareStatement(create);
            pstmt.executeUpdate(create);
        } catch (SQLException e1) {
            System.out.println("Problem in createAccountsTable() method" + e1);
        }
    }

    public void createAccSeq() {
        try {
            // Creating a sequence
            String createseq = "create sequence acc_seq increment by 1 start with 1";
            pstmt = conn.prepareStatement(createseq);
            pstmt.executeUpdate();
            // Insert data into table
        } catch (SQLException e1) {
            System.out.println("Problem in createAccSeq() method" + e1);
        }
    }

    public void fillAccTable() {
        try {
            String insertString = "INSERT INTO Accounts(accno,accType,fname,"
                    + "lname,balance,dateOpened) values(acc_seq.nextVal,?,?,?,?,?)";
            pstmt = conn.prepareStatement(insertString);

            pstmt.setString(1, "SA");
            pstmt.setString(2, "Peter");
            pstmt.setString(3, "Lynch");
            pstmt.setDouble(4, 15000.00);
            pstmt.setDate(5, Date.valueOf("2015-01-23"));
            pstmt.executeUpdate();

            pstmt.setString(1, "CA");
            pstmt.setString(2, "Donal");
            pstmt.setString(3, "Brady");
            pstmt.setDouble(4, 10000.00);
            pstmt.setDate(5, Date.valueOf("2014-04-29"));
            pstmt.executeUpdate();

            pstmt.setString(1, "SA");
            pstmt.setString(2, "Mary");
            pstmt.setString(3, "Mahon");
            pstmt.setDouble(4, 124000.00);
            pstmt.setDate(5, Date.valueOf("2014-04-29"));
            pstmt.executeUpdate();

            pstmt.setString(1, "CA");
            pstmt.setString(2, "Glen");
            pstmt.setString(3, "Gilson");
            pstmt.setDouble(4, 60000.00);
            pstmt.setDate(5, Date.valueOf("2014-05-06"));
            pstmt.executeUpdate();

            pstmt.setString(1, "CA");
            pstmt.setString(2, "David");
            pstmt.setString(3, "Lennon");
            pstmt.setDouble(4, 60000.00);
            pstmt.setDate(5, Date.valueOf("2015-05-06"));
            pstmt.executeUpdate();

            pstmt.setString(1, "SA");
            pstmt.setString(2, "Carmel");
            pstmt.setString(3, "Smith");
            pstmt.setDouble(4, 89000.00);
            pstmt.setDate(5, Date.valueOf("2008-04-16"));
            pstmt.executeUpdate();

            pstmt.setString(1, "SA");
            pstmt.setString(2, "Gerry");
            pstmt.setString(3, "Mahon");
            pstmt.setDouble(4, 124000.00);
            pstmt.setDate(5, Date.valueOf("2008-04-16"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.print("Problem in fillAccTable() method " + e);
            System.exit(1);
        }
    }

    // This method returns a ResultSet which holds all the data from the 
    // Accounts table ordered by ID
    public ResultSet getAccounts() {
        try {
            String queryString = "SELECT * FROM accounts ORDER BY accno";

            pstmt = conn.prepareStatement(queryString);
            rset = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rset;
    }
    // This method returns a ResultSet which holds all the record  
    // with the highest ID

    public ResultSet getMaxAccount() {
        String sqlStatement = "SELECT * FROM Accounts where accno in "
                + "(select max (accno) from Accounts)";

        try {
            pstmt = conn.prepareStatement(sqlStatement);
            rset = pstmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ERROR in getMaxAccount() method " + ex.getMessage());
        }
        return rset;
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

    public void addAccount(String type, String fname, String lname, double balance, Calendar dateOpened) {
        try {
            // Create a string with an INSERT statement.
            String sqlStatement = "INSERT INTO Accounts values(acc_seq.nextVal,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sqlStatement);

            pstmt.setString(1, type);
            pstmt.setString(2, fname);
            pstmt.setString(3, lname);
            pstmt.setDouble(4, balance);
            pstmt.setDate(5, new java.sql.Date(dateOpened.getTimeInMillis()));
            pstmt.executeUpdate();

            // Display the results.
            System.out.println(" row added to the table.");
        } catch (SQLException ex) {
            System.out.println("ERROR in add() method " + ex.getMessage());
        }
    }

    public void lodgeMoney(int i, double newAm) {
        try {
            String sqlStatement = "Update Accounts "
                    + "SET balance = acc_seq.nextVal,?"
                    + "WHERE Accno = acc_seq.nextVal,?";
            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setDouble(1, newAm);
            pstmt.setInt(2, (i));

            System.out.println("Money lodged");
        } catch (SQLException ex) {
            System.out.println("ERROR in lodge() method " + ex.getMessage());
        }

    }

    public void withdrawMoney(int i, double newAm) {
        try {
            String sqlStatement = "Update Accounts "
                    + "SET balance = acc_seq.nextVal,?"
                    + "WHERE Accno = acc_seq.nextVal,?";
            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setDouble(1, newAm);
            pstmt.setInt(2, (i));

            System.out.println("Money withdrawn");
        } catch (SQLException ex) {
            System.out.println("ERROR in withdraw() method " + ex.getMessage());
        }

    }

    public void applyTax(int i, double d) {
        try {
            String sqlStatement = "Update Accounts "
                    + "SET balance = acc_seq.nextVal,?"
                    + "WHERE Accno = acc_seq.nextVal,?";
            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setDouble(1, d);
            pstmt.setInt(2, i);

        } catch (SQLException ex) {
            System.out.println("ERROR in withdraw() method " + ex.getMessage());
        }
    }
}
