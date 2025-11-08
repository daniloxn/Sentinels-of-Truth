package org.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataBaseUtils {
    
    public static void InsertDB(String url, String status) {
        String dados = "INSERT INTO notices(url, status) VALUES (?, ?);";

        try (Connection db = DataBaseConnection.connect();
            PreparedStatement sql = db.prepareStatement(dados)) {

            sql.setString(1, url);
            sql.setString(2, status);

            sql.executeUpdate();
            System.out.println("\nNews item saved successfully.");
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

}
