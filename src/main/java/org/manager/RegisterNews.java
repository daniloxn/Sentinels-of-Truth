package org.manager;
import org.database.RegisterDB;
import org.ui.*;
import org.utils.*;

import java.util.Scanner;

public class RegisterNews {
    private Scanner input;

    public RegisterNews(Scanner input) {
        this.input = input; 
    }

    String url;
    String status;
    public void newRegister() {
        url = InputUtils.readString("\nURL - ");
        status();
    }

    public void status() {

        int option;
        Menus.menuStatus();
        option = InputUtils.readIntRange("➤ Choose an option: ", 1, 4);
        input.nextLine(); 
        status = OptionsUtils.getStatus(option);

        if (option >=1 && option <= 3) {
            RegisterDB.insertDB(url, status);
        }

    }    
}
