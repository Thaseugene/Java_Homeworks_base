package by.itacademy.hw20.console;

import by.itacademy.hw20.console.authenctication.AuthenticationMenu;
import by.itacademy.hw20.console.main.MainMenu;
import by.itacademy.hw20.console.service.MenuPrinter;
import by.itacademy.hw20.repositories.CarMasterRepository;
import by.itacademy.hw20.repositories.Garage;
import by.itacademy.hw20.repositories.OrderRepository;
import by.itacademy.hw20.repositories.UserRepository;

public class Console {
    private final Garage garage;
    private final CarMasterRepository carMasterRep;
    private final OrderRepository orderRep;
    private final UserRepository userRep;
    private final MenuPrinter menuPrinter;
    private final MainMenu mainMenu;
    private final AuthenticationMenu authenticationMenu;

    public Console() {
        this.menuPrinter = new MenuPrinter();
        this.garage = Garage.getInstance();
        this.userRep = UserRepository.getInstance();
        this.carMasterRep = CarMasterRepository.getInstance();
        this.orderRep = OrderRepository.getInstance(garage, carMasterRep);
        this.mainMenu = new MainMenu();
        this.authenticationMenu = new AuthenticationMenu();
    }

    public void startConsole() {
        authenticationMenu.runMenu(menuPrinter, userRep);
        mainMenu.runMenu(menuPrinter, userRep, garage, orderRep, carMasterRep, mainMenu);
    }

}

