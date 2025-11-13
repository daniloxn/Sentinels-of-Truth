package org.app;
import org.app.database.DBConnection;
import org.app.ui.Menus;
import org.app.utils.InputUtils;
import org.app.utils.OptionsUtils;



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