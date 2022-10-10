package by.itacademy.hw20.task1.console;

import by.itacademy.hw20.task1.console.authenctication.AuthenticationMenu;
import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;

public class Console {
    private final UserRepository userRep;
    private final MenuPrinter menuPrinter;
    private final MainMenu mainMenu;
    private final AuthenticationMenu authenticationMenu;

    public Console() {
        this.menuPrinter = new MenuPrinter();
        Garage garage = Garage.getInstance();
        this.userRep = UserRepository.getInstance();
        CarMasterRepository carMasterRep = CarMasterRepository.getInstance();
        OrderRepository orderRep = OrderRepository.getInstance(garage, carMasterRep);
        this.mainMenu = new MainMenu(garage, carMasterRep, orderRep, userRep, menuPrinter);
        this.authenticationMenu = new AuthenticationMenu();
    }

    public void startConsole() {
        authenticationMenu.runMenu(menuPrinter, userRep);
        mainMenu.runMenu(mainMenu);
    }

}

