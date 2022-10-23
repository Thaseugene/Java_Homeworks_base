package by.itacademy.hw20.task1.console.main.submenu1;

import by.itacademy.hw20.task1.actions.ActionCommander;
import by.itacademy.hw20.task1.console.main.Menu;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;

public class SubmenuGarage extends Menu {

    private final ActionCommander actionCommander;

    public SubmenuGarage() {
        this.actionCommander = ActionCommander.getInstance();
    }

    @Override
    public void runMenu() {
        int selection = 0;
        while (selection != 4) {
            MenuPrinter.printSubmenu1();
            selection = ConsoleScanAssistant.scanInt();
            try {
                actionCommander.getCarActionsCollector().getActionsMap().get(String.valueOf(selection))
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
