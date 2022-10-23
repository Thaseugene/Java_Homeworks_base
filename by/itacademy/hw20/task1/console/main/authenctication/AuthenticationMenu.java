package by.itacademy.hw20.task1.console.main.authenctication;

import by.itacademy.hw20.task1.actions.ActionCommander;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;

public class AuthenticationMenu {

    private static AuthenticationMenu instance;
    private final ActionCommander actionCommander;
    private final LoginStatus loginStatus;

    private AuthenticationMenu() {
        this.actionCommander = ActionCommander.getInstance();
        this.loginStatus = LoginStatus.getInstance();
    }


    public void runMenu() {
        while (!loginStatus.isEntered()) {
            MenuPrinter.printAuthMenu();
            try {
                actionCommander.getLogInActionsCollector().getActionsMap().get(ConsoleScanAssistant.scanString())
                        .execute();
            } catch (NullPointerException ex) {
                System.out.println("Incorrect number");
            }
        }
    }

    public static AuthenticationMenu getInstance() {
        if (instance == null) {
            instance = new AuthenticationMenu();
        }
        return instance;
    }
}


