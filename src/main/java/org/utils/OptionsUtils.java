package org.utils;
import org.manager.*;
import org.database.*;
import org.manager.RegisterNews;



public class OptionsUtils {
    
    public static boolean executeMenuOption(int option, RegisterNews register){
        switch (option) {
                case 1:
                    register.newRegister();
                    return true;
                case 2:
                    ListNews.list();
                    return true;
                case 3:
                    return true;
                case 4:
                    return true;
                case 5:
                    return false;
                default:
                    System.out.println("Invalid option!");
                    return true;
            }
    }

    public static String getStatus(int option) {
        switch (option) {
            case 1:
                return "True";
            case 2:
                return "False";
            case 3:
                return "Not checked";
            case 4:
                return "Cancelled";
            default:
                return "Unknown";
        }
    }

    public static void executeType(int option) {
        switch (option) {
            case 1:
                ListDB.listAll();
                break;
            case 2:
                ListDB.listReal();
                break;
            case 3:
                ListDB.listFake();
                break;
            case 4:
                ListDB.listNotChecked();
                break;
            default:
                break;
        }
    }

    
    
}
