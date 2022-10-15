package by.itacademy.hw20.task1.actions;

import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.service.RegistrationService;
import by.itacademy.hw20.task1.console.main.enums.StandardPhrases;


public class ActionRegister extends Action {

    private final RegistrationService registrationService;

    public ActionRegister() {
        this.registrationService = RegistrationService.getInstance();
    }

    @Override
    public void execute() {

        String login = ConsoleScanAssistant.printAndScanLine(StandardPhrases.LOGIN_CONDITION.getText());
        if (registrationService.checkLogin(login)) {
            String password = ConsoleScanAssistant.printAndScanLine(StandardPhrases.PASS_CONDITION.getText());
            if (registrationService.checkPassword(password)) {
                registrationService.register(login, password);
                PrintToConsole.print(StandardPhrases.LOGIN_CREATED.getText());
            }
        }
    }


}
