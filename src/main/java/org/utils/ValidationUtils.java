package org.utils;
import org.app.*;
public class ValidationUtils {
    
    public static boolean executeMenuOption(int option, Register register){
        switch (option) {
                case 1:
                    register.newRegister();
                    return true;
                case 2:
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
    
}
