package examplePreparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class CoffeeOperations {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rset;

   public void openDB() {
        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            //ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");               
            //ods.setUser("?????");
            //ods.setPassword("??????");
            ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            ods.setUser("hr");
            ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    /**
     * The dropTables method drops any existing in case the database already exists.
     */
    public void dropTables() {
        String sql1 = "DROP TABLE Coffee";
        System.out.println("Checking for existing tables.");

        try {
            pstmt = conn.prepareStatement(sql1);
            // Drop the Coffee table.
            pstmt.execute();
            System.out.println("Coffee table dropped.");
        } catch (SQLException ex) {
            // No need to report an error.
            // The table simply did not exist.
        }
    }

    /**
     * The buildCoffeeTable method creates the Coffee table and adds some rows to it.
     */
    public void buildCoffeeTable() {
        try {
            String sql1 = "CREATE TABLE Coffee "
                    + "(Description VARCHAR(25),ProdNum VARCHAR(10) NOT NULL PRIMARY KEY, Price DECIMAL(5,2))";
            // Get a Statement object.
            pstmt = conn.prepareStatement(sql1);
            // Create the table.
            pstmt.executeUpdate();

            String sql2 = "INSERT INTO Coffee VALUES (?,?,?)";
            pstmt = conn.prepareStatement(sql2);
            // Insert row #1.
            pstmt.setString(1, "Bolivian Dark");
            pstmt.setString(2, "14-001");
            pstmt.setDouble(3, 8.95);
            pstmt.executeUpdate();

            // Insert row #2.
            pstmt.setString(1, "Bolivian Medium");
            pstmt.setString(2, "14-002");
            pstmt.setDouble(3, 7.95);
            pstmt.executeUpdate();

            // Insert row #3.
            pstmt.setString(1, "Brazilian Medium");
            pstmt.setString(2, "15-002");
            pstmt.setDouble(3, 7.95);
            pstmt.executeUpdate();

            // Insert row #4.
            pstmt.setString(1, "Brazilian Decaf");
            pstmt.setString(2, "15-003");
            pstmt.setDouble(3, 8.55);
            pstmt.executeUpdate();

            // Insert row #5.
            pstmt.setString(1, "Central American Dark");
            pstmt.setString(2, "16-001");
            pstmt.setDouble(3, 9.95);
            pstmt.executeUpdate();

            // Insert row #6.
            pstmt.setString(1, "Central American Medium");
            pstmt.setString(2, "16-002");
            pstmt.setDouble(3, 9.95);
            pstmt.executeUpdate();

            // Insert row #7.
            pstmt.setString(1, "Sumatra Dark");
            pstmt.setString(2, "17-001");
            pstmt.setDouble(3, 7.95);
            pstmt.executeUpdate();

            // Insert row #8.
            pstmt.setString(1, "Sumatra Decaf");
            pstmt.setString(2, "17-002");
            pstmt.setDouble(3, 8.95);
            pstmt.executeUpdate();

            // Insert row #9.
            pstmt.setString(1, "Sumatra Medium");
            pstmt.setString(2, "17-003");
            pstmt.setDouble(3, 7.95);
            pstmt.executeUpdate();

            // Insert row #10.
            pstmt.setString(1, "Sumatra Organic Dark");
            pstmt.setString(2, "17-004");
            pstmt.setDouble(3, 11.95);
            pstmt.executeUpdate();

            System.out.println("Coffee table created.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void queryDB() {
        String sqlStatement = "SELECT * FROM Coffee";
        try {
            // Send the statement to the DBMS.
            pstmt = conn.prepareStatement(sqlStatement);
            rset = pstmt.executeQuery();

            // Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("%25s %10s %5.2f\n",
                        rset.getString("Description"),
                        rset.getString("ProdNum"), rset.getDouble("Price"));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void add(String description, String prodNum, double price) {
        try {
            // Create a string with an INSERT statement.
            String sqlStatement = "INSERT INTO Coffee VALUES (?,?,?)";
            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setString(1, description);
            pstmt.setString(2, prodNum);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();

            // Display the results.
            System.out.println("1 row added to the table.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void updateRecord(double price,String prodID) {
        try {
            // Create a string with an UPDATE statement.
            String sqlStatement = "UPDATE Coffee SET Price = ?"
                    + "WHERE ProdNum = ?";

            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setDouble(1, price);
            pstmt.setString(2, prodID);
            pstmt.executeUpdate();

            // Display the results.
            System.out.println(" row updated in the table.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

     public boolean findCoffeeRecord(String id) {
        boolean found = false;
        
        String sqlStatement = "SELECT * FROM Coffee where prodnum = " +"'"+id+"'";
        try {
            pstmt = conn.prepareStatement(sqlStatement);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                found = true;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        return found;
    }
    public void deleteRecord(String prodID) {
        try {
            // Create a string with an DELETE statement.
            
            String sqlStatement = "DELETE FROM Coffee WHERE ProdNum = ?";

            pstmt = conn.prepareStatement(sqlStatement);
            pstmt.setString(1, prodID);
            pstmt.executeUpdate();

            // Display the results.
            System.out.println(" row deleted from the table.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

       public void closeDB() {
        try {
            pstmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
}
