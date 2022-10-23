package by.itacademy.hw20.task1.console.main.submenu2;

import by.itacademy.hw20.task1.actions.ActionCommander;
import by.itacademy.hw20.task1.console.main.Menu;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;

public class SubmenuMaster extends Menu {



    private final ActionCommander actionCommander;

    public SubmenuMaster() {
        this.actionCommander = ActionCommander.getInstance();
    }

    @Override
    public void runMenu() {
        int selection = 0;
        while (selection != 4) {
            MenuPrinter.printSubmenu2();
            selection = ConsoleScanAssistant.scanInt();
            try {
                actionCommander.getCarMasterActionsCollector().getActionsMap().get(String.valueOf(selection))
                        .execute();
            } catch (NullPointerException ex) {
                if (selection == 4) {
                    PrintToConsole.print(StandardPhrases.TO_MAIN.getText());
                } else {
                    PrintToConsole.print(StandardPhrases.INC_NUM.getText());
                }
            }
        }
    }
}
