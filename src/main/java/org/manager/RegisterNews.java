package org.manager;
import org.database.RegisterDB;
import org.ui.*;
import org.utils.*;


public class RegisterNews {


    static String url;
    static String status;
    public static void newRegister() {
        url = InputUtils.readString("\nURL - ");
        registerStatus();
    }

    public static void registerStatus(){
        int option;
        Menus.menuStatus();
        option = InputUtils.readIntRange("➤ Choose an status: ", 1, 4);
        status = OptionsUtils.getStatus(option);

        if (option != 4) {
            RegisterDB.insertDB(url, status);
        }
    }
 
}
