package org.app.utils;
import org.app.ui.Menus;

public class GetStatus {

    public static String status() {
        int option;
        Menus.menuStatus();
        option = InputUtils.readIntRange("➤ Choose an status: ", 1, 4);

        String status = OptionsUtils.getStatus(option);

        return status;
    }
}
