package org.utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner input = new Scanner(System.in);
    
    public static int readInt(String promt){
        System.out.print(promt);
        while (true) {
            if (input.hasNextInt()) {
                int value = input.nextInt();
                input.nextLine();
                return value;
            } else {
                System.out.println("Error, please enter a valid integer!");
                input.next();
            }
        }
    }

    public static int readIntRange(String promt, int min, int max) {
        while (true) {
            int value = readInt(promt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.printf("Erro, enter an number between %d and %d \n", min, max);
        }
        
    }

    public static String readString(String promt) {
        System.out.print(promt);
        while (true) {
            if (input.hasNext()) {
                String value = input.nextLine();
                return value;
            } else {
                System.out.println("Error, please enter a valid text!");
            }
        }
    }

    public static String readStringOptions(String promt, String... options) {
        System.out.print(promt);

        while (true) {
            String value = input.nextLine().trim();

            for (String option : options) {
                if (value.equalsIgnoreCase(option)) {
                    return value;
                }
            }

            System.out.println("Invalid option. Allowed values: ");
            for (String option : options) {
                System.out.println("-" + option);
            }
            System.out.print(promt);
        }
    }
}
