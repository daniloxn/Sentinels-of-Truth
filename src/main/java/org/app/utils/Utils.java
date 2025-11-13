package org.app.utils;
import java.util.Scanner;

public class Utils {
    private static Scanner input;

    public Utils(Scanner input) {
        Utils.input = input;
    }
    public static void interval(){
        System.out.print("\nPress ENTER to continue...");
        input.nextLine();
    }
}
