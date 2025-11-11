package org.database;

public class UpdateDB {
    public static void updateStatus(int id, String novoStatus) {
        String sql = "UPDATE notices SET status = ? WHERE id = ? ";
        try{
            int lines = DBHelper.executeUpdate(sql, novoStatus, id);

            if (lines == 0) {
                System.out.println("No news items were found with that ID.");
            } else {
                System.out.print("Status updated successfully.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
