package org.app.manager;
import org.app.ui.*;
import org.app.utils.*;

public class ListNews {
    public static void list() {
        Menus.menuList();
        int option = InputUtils.readIntRange("➤ Choose an option: ", 1, 5);
        OptionsUtils.executeTypeOption(option);
    }
}
