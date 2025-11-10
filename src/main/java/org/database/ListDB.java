package org.database;
import java.sql.SQLException;


public class ListDB {

    public static void listAll(){
        var listall = "SELECT id, url, status FROM notices";

        try {
            System.out.printf("%-5s %-50s %-20s%n", "ID", "URL", "STATUS");
            System.out.println("---------------------------------------------------------------------------------------");

            DBHelper.executeQuery(listall, rs -> {
                boolean empty = true;

                while (rs.next()) {
                    empty = false;
                    System.out.printf("%-5d %-50s %-20s%n",
                    rs.getInt("id"),
                    rs.getString("url"),
                    rs.getString("status")
                    );
                }
                if (empty) {
                    System.out.println("No results found.");
                }
            });
            System.out.println("---------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
            
    public static void listFake(){
        var listFake = "SELECT id, url, status FROM notices WHERE status = 'FALSE' ";

        try {
            System.out.printf("%-5s %-50s %-20s%n", "ID", "URL", "STATUS");
            System.out.println("---------------------------------------------------------------------------------------");
    
             DBHelper.executeQuery(listFake, rs -> {
                boolean empty = true;
                while (rs.next()) {
                    empty = false;
                    System.out.printf("%-5d %-50s %-20s%n",
                    rs.getInt("id"),
                    rs.getString("url"),
                    rs.getString("status")
                    );
                    
                }
                if (empty) {
                    System.out.println("No results found.");
                }
            });
            System.out.println("---------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listReal(){
        var listFake = "SELECT id, url, status FROM notices WHERE status = 'True' ";

        try {
            System.out.printf("%-5s %-50s %-20s%n", "ID", "URL", "STATUS");
            System.out.println("---------------------------------------------------------------------------------------");
    
             DBHelper.executeQuery(listFake, rs -> {
                boolean empty = true;

                while (rs.next()) {
                    empty = false;
                    System.out.printf("%-5d %-50s %-20s%n",
                    rs.getInt("id"),
                    rs.getString("url"),
                    rs.getString("status")
                    );
                }
                if (empty) {
                    System.out.println("No results found.");
                }
            });
            System.out.println("---------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void listNotChecked(){
        var listFake = "SELECT id, url, status FROM notices WHERE status = 'Not checked' ";

        try {
            System.out.printf("%-5s %-50s %-20s%n", "ID", "URL", "STATUS");
            System.out.println("---------------------------------------------------------------------------------------");
    
             DBHelper.executeQuery(listFake, rs -> {
                boolean empty = true;

                while (rs.next()) {
                    empty = false;
                    System.out.printf("%-5d %-50s %-20s%n",
                    rs.getInt("id"),
                    rs.getString("url"),
                    rs.getString("status")
                    );
                    
                }
                if (empty) {
                    System.out.println("No results found.");
                }
            });
            System.out.println("---------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

