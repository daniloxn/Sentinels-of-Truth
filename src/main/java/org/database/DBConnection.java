package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    static String url = "jdbc:sqlite:data/database.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public static void createTables() {
        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();) {
                stmt.execute("CREATE TABLE IF NOT EXISTS notices( id INTEGER PRIMARY KEY AUTOINCREMENT, url TEXT NOT NULL, status CHAR(10) NOT NULL);");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
