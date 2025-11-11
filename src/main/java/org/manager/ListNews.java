package org.manager;
import org.ui.*;
import org.utils.*;

public class ListNews {
    public static void list() {
        Menus.menuList();
        int option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
        OptionsUtils.executeType(option);
    }
}
