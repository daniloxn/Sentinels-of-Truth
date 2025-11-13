package org.app.database;

public class UpdateDB {
    public static void updateStatus(int id, String novoStatus) {
        String sql = "UPDATE notices SET status = ? WHERE id = ? ";
        try{
            int lines = DBHelper.executeUpdate(sql, novoStatus, id);

            if (lines == 0) {
                System.out.println("\nNo news items were found with that ID.\n");
            } else {
                System.out.print("\nStatus updated successfully.\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
