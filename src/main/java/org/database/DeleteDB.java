package org.database;

public class DeleteDB {
     public static void deleteDB() {
        String dados = "DELETE FROM notices WHERE id = ?";

        try {
            
            DBHelper.executeQuery(dados, );
        }
     }

    
}
