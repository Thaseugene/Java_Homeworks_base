package by.itacademy.hw20.console.authenctication;

import by.itacademy.hw20.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.console.service.PrintToConsole;
import by.itacademy.hw20.repositories.UserRepository;
import by.itacademy.hw20.service.Validator;
import by.itacademy.hw20.service.enums.StandardPhrases;

public class ActionLogIn {

    public boolean checkIsLoginExist(UserRepository userRep) {
        boolean check = false;

        String login = ConsoleScanAssistant.printAndScanLine(StandardPhrases.ENTER_LOG.getText());
        if (Validator.checkLogin(userRep, login) && checkIsPasswordExist(userRep,login)) {
            check = true;
        }
        return check;
    }

    private boolean checkIsPasswordExist(UserRepository userRep, String login) {
        PrintToConsole.print(StandardPhrases.ENTER_PAS.getText());
        return Validator.checkPassword(userRep, ConsoleScanAssistant.scanString(), login);
    }

}
