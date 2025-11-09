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
}
