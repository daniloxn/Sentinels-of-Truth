package org.app.manager;
import org.app.database.UpdateDB;
import org.app.utils.*;
public class UpdateNews {
    public static void updateStatus() {
        int id;
        String status;
        id = InputUtils.readInt("\nID - ");
        status = GetStatus.status();

        try {
            UpdateDB.updateStatus(id, status);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("It was not possible to update the news.");
        }

    }
    
}
