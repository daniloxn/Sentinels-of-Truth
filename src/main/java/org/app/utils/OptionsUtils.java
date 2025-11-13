package org.app.utils;
import org.app.database.*;
import org.app.manager.*;



public class OptionsUtils {
    
    public static boolean executeMenuOption(int option){
        switch (option) {
                case 1:
                    RegisterNews.newRegister();
                    return true;
                case 2:
                    ListNews.list();
                    return true;
                case 3:
                    UpdateNews.updateStatus();
                    return true;
                case 4:
                DeleteNews.delete();
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
                return "Real";
            case 2:
                return "Fake";
            case 3:
                return "Not checked";
            case 4:
                return "Cancelled";
            default:
                return "Unknown";
        }
    }

    public static void executeTypeOption(int option) {
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

    public static void executeDeleteOption(int confirmation, int id) {
        switch (confirmation) {
            case 1:
                DeleteDB.delete(id);
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    
    
}
