package org.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ListDB {

    public static void newsList(){
        var list = "SELECT id, url, status FROM notices";

        try (Connection db = DBConnection.connect();
             Statement sql = db.createStatement();
             var rs = sql.executeQuery(list)) {
                while (rs.next()) {
                    System.out.printf("\nID-%d     URL-%s     STATUS-%s\n",
                    rs.getInt("id"),
                    rs.getString("url"),
                    rs.getString("status"));
                }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
