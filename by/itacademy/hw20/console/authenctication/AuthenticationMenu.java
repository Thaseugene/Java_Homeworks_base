package by.itacademy.hw20.console.authenctication;

import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class AuthenticationMenu {

    private ActionLogIn actionLogIn = new ActionLogIn();
    private ActionRegister actionRegister = new ActionRegister();

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
                case 3 -> System.exit(0);
                default -> PrintToConsole.print(StandardPhrases.SELECT_INVALID.getText());
            }
        }
    }
}
