package by.itacademy.hw20.task1.console.main.submenu2;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.repositories.Garage;
import by.itacademy.hw20.task1.repositories.OrderRepository;
import by.itacademy.hw20.task1.repositories.UserRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class SubmenuMaster {

    private ActionAddMaster actionAddMaster = new ActionAddMaster();
    private ActionRemoveMaster actionRemoveMaster = new ActionRemoveMaster();

    public void runSubmenu(MenuPrinter printer, UserRepository userRep, Garage garage, OrderRepository orderRep,
                                  CarMasterRepository carMasterRep, SubmenuMaster submenuMaster, MainMenu menu) {
        int selection = 0;
        do {
            printer.printSubmenu2();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddMaster.addMaster(carMasterRep);
                case 2 -> actionRemoveMaster
                        .removeMaster(printer, userRep, garage, orderRep, carMasterRep, submenuMaster, menu);
                case 3 -> ListPrinter.printList(carMasterRep.getCarMasters());
                case 4 -> menu.runMenu(printer, userRep, garage, orderRep, carMasterRep, menu);
                default -> PrintToConsole.print(StandardPhrases.SELECT_INVALID.getText());
            }
        } while (selection != 4);
    }
}
