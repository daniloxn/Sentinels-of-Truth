package org.manager;

import org.utils.InputUtils;

public class DeleteNews {
    public static int deleteDB() {
        int id;
        id = InputUtils.readInt("enter a ID desired: ");
        return id;
    }
}
