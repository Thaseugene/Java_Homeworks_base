package by.itacademy.hw20.task1.console.authenctication;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class AuthenticationMenu {

    private final ActionLogIn actionLogIn = new ActionLogIn();
    private final ActionRegister actionRegister = new ActionRegister();

    public void runMenu(MenuPrinter menuPrinter, UserRepository userRep) {
        boolean isEntered = false;
        while (!isEntered) {
            menuPrinter.printAuthMenu();
            switch (ConsoleScanAssistant.scanInt()) {
                case 1 -> {
                    if (actionLogIn.checkIsLoginExist(userRep)) {
                        isEntered = true;
                        PrintToConsole.print(StandardPhrases.SIGNED_IN.getText());
                    }
                }
                case 2 -> actionRegister.tryToRegister(userRep);
                case 3 -> Runtime.getRuntime().halt(0);
                default -> PrintToConsole.print(StandardPhrases.SELECT_INVALID.getText());
            }
        }
    }
}
