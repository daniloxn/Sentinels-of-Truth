package org.app;
import org.ui.*;
import org.database.*;
import org.utils.*;

import java.util.Scanner;

public class Register {
    private Scanner input;

    public Register(Scanner input) {
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
        
        status = ValidationUtils.getStatus(option);
        if (option >=1 && option <= 3) {
            RegisterDB.insertDB(url, status);
        }
        
    }    
}
