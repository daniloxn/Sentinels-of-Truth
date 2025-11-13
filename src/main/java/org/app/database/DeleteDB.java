package org.app.database;

public class DeleteDB {
    public static void delete(int id) {
        var delete = "DELETE FROM notices WHERE ID = " + id;

        try {
            DBHelper.executeUpdate(delete);
            System.out.println("\nNews item successfully deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
