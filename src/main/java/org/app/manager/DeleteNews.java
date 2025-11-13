package org.app.manager;

import org.app.database.ListDB;
import org.app.utils.InputUtils;
import org.app.utils.OptionsUtils;

public class DeleteNews {
    public static void delete() {
        int id;
        int confirmation;
        id = InputUtils.readInt("\nEnter a ID desired: ");
        if (ListDB.searchID(id)) {
            confirmation = InputUtils.readIntRange("\nare you sure you want to delete this news item? (1-Yes / 2-No)", 1, 2);
            OptionsUtils.executeDeleteOption(confirmation, id);
        }
    }
}
