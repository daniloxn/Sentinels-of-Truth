package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Register {
    private Scanner input;

    public Register(Scanner input) {
        this.input = input; // usa o mesmo scanner do main
    }

    String url;
    String status;
    public void register() {
        
        System.out.print("\n╔══════════════════════════════╗\r\n" + //
                        "║        NOTICE REGISTER       ║\r\n" + //
                        "╠══════════════════════════════╣\r\n" + //
                        "║ URL - ");

        url = input.next();
        System.out.println("╚══════════════════════════════╝");
        status();
    }

    public void status() {
        int option = -1;
        while (true) {
            System.out.print("\n╔══════════════════════════════╗\r\n" + //
                    "║            STATUS            ║\r\n" + //
                    "╠══════════════════════════════╣\r\n" + //
                    "║ Define the news status       ║\r\n" + //
                    "║ (1) - True                   ║\r\n" + //
                    "║ (2) - False                  ║\r\n" + //
                    "║ (3) - Not cheched            ║\r\n" + //
                    "║ (4) - Back to main menu      ║\r\n" + //
                    "╚══════════════════════════════╝\r\n" + //
                    "➤ Choose an option: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid response: Please enter a number between 1 and 4.");
                input.nextLine();
                continue;
            }

            option = input.nextInt();
            input.nextLine(); 

            if (option < 1 || option > 4) {
                System.out.println("Invalid option: choose between 1 and 4.");
                continue;
            }

            
            break;
        }

        switch (option) {
            case 1:
                status = "True";
                break;
            case 2:
                status = "False";
                break;
            case 3:
                status = "Not checked";
                break;
            case 4:
                break;
        }
        InsertDB();
    }

    public void InsertDB() {
        String dados = "INSERT INTO notices(url, status) VALUES (?, ?);";

        try (Connection db = DataBase.connect();
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
