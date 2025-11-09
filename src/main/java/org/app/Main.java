package org.app;
import org.ui.Menus;
import org.utils.InputUtils;
import org.utils.Utils;
import org.utils.ValidationUtils;

import java.util.Scanner;
import org.database.DBConnection;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Register register = new Register(input);
        Utils utils = new Utils(input);
        DBConnection.createTables();
        int option;
        boolean continueRunning = true;

        do {
            Menus.menuMain();
            option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
            continueRunning = ValidationUtils.executeMenuOption(option, register);
            } while (continueRunning);
        }

    
    }