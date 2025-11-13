package org.app.database;

public class RegisterDB {
    public static void insertDB(String url, String status){
        String dados = "INSERT INTO notices(url, status) VALUES (?, ?);";
        try {
            DBHelper.executeUpdate(dados, url, status);
            System.out.println("\nNews item saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

