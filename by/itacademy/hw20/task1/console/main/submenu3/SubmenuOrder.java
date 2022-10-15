package by.itacademy.hw20.task1.console.main.submenu3;

import by.itacademy.hw20.task1.actions.ActionCommander;
import by.itacademy.hw20.task1.console.main.Menu;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;

public class SubmenuOrder extends Menu {


    private final ActionCommander actionCommander;

    public SubmenuOrder() {
        this.actionCommander = ActionCommander.getInstance();
    }

    @Override
    public void runMenu() {
        int selection = 0;
        while (selection != 6) {
            MenuPrinter.printSubmenu3();
            selection = ConsoleScanAssistant.scanInt();
            try {
                actionCommander.getOrderActionsCollector().getActionsMap().get(String.valueOf(selection))
                        .execute();
            } catch (NullPointerException ex) {
                if (selection == 6) {
                    PrintToConsole.print(StandardPhrases.TO_MAIN.getText());
                } else {
                    PrintToConsole.print(StandardPhrases.INC_NUM.getText());
                }
            }
        }
    }
}
