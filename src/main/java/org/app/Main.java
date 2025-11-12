package org.app;
import org.ui.Menus;
import org.utils.InputUtils;
import org.utils.OptionsUtils;

import org.database.DBConnection;



public class Main {
    public static void main(String[] args) {
        DBConnection.createTables();
        int option;
        boolean continueRunning = true;

        do {
            Menus.menuMain();
            option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
            continueRunning = OptionsUtils.executeMenuOption(option);
            } while (continueRunning);
        }

    
    }