package by.itacademy.hw20.task1.console;

import by.itacademy.hw20.task1.console.main.authenctication.AuthenticationMenu;
import by.itacademy.hw20.task1.console.main.menu.MainMenu;

public class Console {

    private final AuthenticationMenu authenticationMenu;
    private final MainMenu mainMenu;

    public Console() {
        this.authenticationMenu = AuthenticationMenu.getInstance();
        this.mainMenu = MainMenu.getInstance();
    }

    public void startConsole() {
        authenticationMenu.runMenu();
        mainMenu.runMenu();
    }
}



