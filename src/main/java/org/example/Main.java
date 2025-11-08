package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase.createTables();
        int option;
        Scanner input = new Scanner(System.in);
        Register register = new Register(input);

        do {
            System.out.print("\n╔══════════════════════════════╗\r\n" + //
                        "║      SENTINEL OF TRUTH       ║\r\n" + //
                        "╠══════════════════════════════╣\r\n" +  //
                        "║ 1 - Register an news         ║\r\n" + //
                        "║ 2 - Consult as result        ║\r\n" + //
                        "║ 3 - Update an notice         ║\r\n" + //
                        "║ 4 - Generate an report       ║\r\n" + //
                        "║ 5 - Exit the program         ║\r\n" + //
                        "╚══════════════════════════════╝\r\n" + //
                        "➤ Choose an option: ");

        option = input.nextInt();
        

        switch (option) {
            case 1:
                register.register();
                break;
            case 2:
                break;
            case 3:
                break;
        
            default:
                break;
                }

            } while (option != 5);
        }
    }