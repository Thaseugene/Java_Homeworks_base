package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.main.authenctication.LoginStatus;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.AuthenticationService;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;

public class ActionLogIn extends Action {

    private final AuthenticationService authenticationService;
    private final LoginStatus loginStatus;
//    private final Console console;

    public ActionLogIn() {
        this.authenticationService = AuthenticationService.getInstance();
        this.loginStatus = LoginStatus.getInstance();
//        this.console = Console.getInstance();
    }

    @Override
    public void execute() {


        String login = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_LOG.getText());
        if (authenticationService.checkLogin(login) && checkIsPasswordExist(login)) {
            loginStatus.setEntered(true);
        }
    }

    private boolean checkIsPasswordExist(String login) {
        PrintToConsole.print(StandardPhrases.ENTER_PAS.getText());
        return authenticationService.checkPassword(ConsoleScanAssistant.scanString(), login);
    }

}
