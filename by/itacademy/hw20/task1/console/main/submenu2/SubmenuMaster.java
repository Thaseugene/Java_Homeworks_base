package by.itacademy.hw20.task1.console.main.submenu2;

import by.itacademy.hw20.task1.console.main.MainMenu;
import by.itacademy.hw20.task1.console.service.ConsoleScanAssistant;
import by.itacademy.hw20.task1.console.service.ListPrinter;
import by.itacademy.hw20.task1.console.service.MenuPrinter;
import by.itacademy.hw20.task1.console.service.PrintToConsole;
import by.itacademy.hw20.task1.repositories.CarMasterRepository;
import by.itacademy.hw20.task1.service.enums.StandardPhrases;

public class SubmenuMaster {

    private final CarMasterRepository carMasterRep;
    private final MenuPrinter menuPrinter;
    private final ActionAddMaster actionAddMaster;
    private final ActionRemoveMaster actionRemoveMaster;

    public SubmenuMaster(CarMasterRepository carMasterRep, MenuPrinter menuPrinter) {
        this.carMasterRep = carMasterRep;
        this.menuPrinter = menuPrinter;
        this.actionAddMaster = new ActionAddMaster(carMasterRep);
        this.actionRemoveMaster = new ActionRemoveMaster(carMasterRep);
    }

    public void runSubmenu(SubmenuMaster submenu, MainMenu menu) {
        int selection;
        do {
            menuPrinter.printSubmenu2();
            selection = ConsoleScanAssistant.scanInt();
            switch (selection) {
                case 1 -> actionAddMaster.addMaster();
                case 2 -> actionRemoveMaster.removeMaster(submenu, menu);
                case 3 -> ListPrinter.printList(carMasterRep.getCarMasters());
                case 4 -> menu.runMenu(menu);
                default -> PrintToConsole.print(StandardPhrases.SELECT_INVALID.getText());
            }
        } while (selection != 4);
    }
}
