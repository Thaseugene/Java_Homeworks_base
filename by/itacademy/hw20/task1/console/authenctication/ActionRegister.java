package by.itacademy.hw20.task1.console.authenctication;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.Registration;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;


public class ActionRegister {

    public void tryToRegister(UserRepository userRep) {

        String login = ConsoleScanAssistant.printAndScanLine(StandardPhrases.LOGIN_CONDITION.getText());
        if (Registration.checkLogin(login, userRep)) {
            String password = ConsoleScanAssistant.printAndScanLine(StandardPhrases.PASS_CONDITION.getText());
            if (Registration.checkPassword(password)) {
                Registration.register(userRep, login, password);
                PrintToConsole.print(StandardPhrases.LOGIN_CREATED.getText());
            }
        }
    }


}
