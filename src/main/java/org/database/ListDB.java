package org.database;
import java.sql.SQLException;

import org.ui.Menus;


public class ListDB {

    public static void dbList(String command){
        try {
            if (DBHelper.exists(command)) {
                Menus.tittleList();
                DBHelper.executeQuery(command, rs -> {
                    while (rs.next()) {
                        System.out.printf("%-5d %-50s %-20s%n",
                        rs.getInt("id"),
                        rs.getString("url"),
                        rs.getString("status")
                        );
                    }
                });
                System.out.println("---------------------------------------------------------------------------------------");
                
            } else {
                Menus.tittleList();
                System.out.println("No news found with this ID.");
                System.out.println("---------------------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listAll(){
        var listall = "SELECT id, url, status FROM notices";
        dbList(listall);
    }
            
    public static void listFake(){
        var listFake = "SELECT id, url, status FROM notices WHERE status = 'Fake' ";

        dbList(listFake);
    }

    public static void listReal(){
        var listReal = "SELECT id, url, status FROM notices WHERE status = 'Real' ";

        dbList(listReal);
    }

    public static void listNotChecked(){
        var listNotChecked = "SELECT id, url, status FROM notices WHERE status = 'Not checked' ";

        dbList(listNotChecked);
    }

    public static boolean searchID(int id) {
        String search = "SELECT id, url, status FROM notices WHERE id = " + id;
        try {
            if (DBHelper.exists(search)) {
                Menus.tittleList();
                DBHelper.executeQuery(search, rs -> {
                    System.out.printf("%-5d %-50s %-20s%n",
                        rs.getInt("id"),
                        rs.getString("url"),
                        rs.getString("status")
                        );
                }); 
            } else {
                System.out.println("\nNo news found with this ID.");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}

