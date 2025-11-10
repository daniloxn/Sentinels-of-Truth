package org.ui;

public class Menus {
    public static void menuMain(){
        System.out.print("\n╔══════════════════════════════╗\n" + //
                        "║      SENTINEL OF TRUTH       ║\n" + //
                        "╠══════════════════════════════╣\n" +  //
                        "║ 1 - Register an news         ║\n" + //
                        "║ 2 - Consult as result        ║\n" + //
                        "║ 3 - Update an notice         ║\n" + //
                        "║ 4 - Generate an report       ║\n" + //
                        "║ 5 - Exit the program         ║\n" + //
                        "╚══════════════════════════════╝\n");
    }

    public static void menuList() {
        System.out.print("\n╔═════════════════════════════════╗\n" + //
                        "║            CHECK NEWS           ║\n" + //
                        "╠═════════════════════════════════╣\n" + //
                        "║ 1 - See all news                ║\n" + //
                        "║ 2 - View REAL news              ║\n" + //
                        "║ 3 - View FAKE news              ║\n" + //
                        "║ 4 - View unverified news        ║\n" + //
                        "║ 5 - Return                      ║\n" + //
                        "╚═════════════════════════════════╝\n");
    }

    public static void menuStatus() {
        System.out.print("\n╔══════════════════════════════╗\n" + //
                "║            STATUS            ║\n" + //
                "╠══════════════════════════════╣\n" + //
                "║ Define the news status       ║\n" + //
                "║ (1) - True                   ║\n" + //
                "║ (2) - False                  ║\n" + //
                "║ (3) - Not cheched            ║\n" + //
                "║ (4) - Back to main menu      ║\n" + //
                "╚══════════════════════════════╝\n");
    }
}
