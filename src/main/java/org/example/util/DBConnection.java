package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database Connection Utility
 * Manages database connections using JDBC
 */
public class DBConnection {
    
    // Database configuration
    private static final String URL = "jdbc:mysql://localhost:3306/canevaz_azote_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "canevaz_user";
    private static final String PASSWORD = "ProjectAdmin#2025";
    
    // Static block to load MySQL driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }
    }
    
    /**
     * Get a connection to the database
     * @return Connection object
     * @throws SQLException if connection fails
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    /**
     * Test the database connection
     * @return true if connection successful, false otherwise
     */
    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            System.out.println("✅ Database connection successful!");
            System.out.println("Connected to: " + conn.getMetaData().getURL());
            return true;
        } catch (SQLException e) {
            System.err.println("❌ Database connection failed!");
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        // Test connection
        testConnection();
    }
}
