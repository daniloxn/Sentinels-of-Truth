package org.app;
import org.ui.Menus;
import org.utils.InputUtils;
import org.utils.Utils;
import org.utils.OptionsUtils;

import java.util.Scanner;
import org.database.DBConnection;
import org.manager.RegisterNews;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegisterNews register = new RegisterNews(input);
        Utils utils = new Utils(input);
        
        DBConnection.createTables();
        int option;
        boolean continueRunning = true;

        do {
            Menus.menuMain();
            option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
            continueRunning = OptionsUtils.executeMenuOption(option, register);
            } while (continueRunning);
        }

    
    }