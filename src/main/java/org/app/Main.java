package org.app;
import org.ui.Menus;
import org.utils.InputUtils;
import org.utils.ValidationUtils;

import java.util.Scanner;
import org.database.DataBaseConnection;


public class Main {
    public static void main(String[] args) {
        DataBaseConnection.createTables();
        int option;
        Scanner input = new Scanner(System.in);
        Register register = new Register(input);
        boolean continueRunning = true;

        do {
            Menus.menuMain();
            option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
            continueRunning = ValidationUtils.executeMenuOption(option, register);
            } while (continueRunning);
        }
    }