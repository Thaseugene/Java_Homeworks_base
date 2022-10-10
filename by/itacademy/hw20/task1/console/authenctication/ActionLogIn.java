package by.itacademy.hw20.task1.console.authenctication;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.AuthenticationService;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class ActionLogIn {

    public boolean checkIsLoginExist(UserRepository userRep) {
        boolean check = false;

        String login = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_LOG.getText());
        if (AuthenticationService.checkLogin(userRep, login) && checkIsPasswordExist(userRep,login)) {
            check = true;
        }
        return check;
    }

    private boolean checkIsPasswordExist(UserRepository userRep, String login) {
        PrintToConsole.print(StandardPhrases.ENTER_PAS.getText());
        return AuthenticationService.checkPassword(userRep, ConsoleScanAssistant.scanString(), login);
    }

}
