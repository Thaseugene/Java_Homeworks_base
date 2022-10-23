package by.itacademy.hw20.task1.console.main.collector;

import by.itacademy.hw20.task1.console.main.Menu;
import by.itacademy.hw20.task1.console.main.submenu1.SubmenuGarage;
import by.itacademy.hw20.task1.console.main.submenu2.SubmenuMaster;
import by.itacademy.hw20.task1.console.main.submenu3.SubmenuOrder;

import java.util.HashMap;
import java.util.Map;

public class MenuCollector {

    private static MenuCollector instance;
    private final Map<Integer, Menu> menuMap;

    private MenuCollector() {
        this.menuMap = new HashMap<>();
        init();
    }

    public static MenuCollector getInstance() {
        if (instance == null) {
            instance = new MenuCollector();
        }
        return instance;
    }

    private void init() {
        menuMap.put(1, new SubmenuGarage());
        menuMap.put(2, new SubmenuMaster());
        menuMap.put(3, new SubmenuOrder());
    }

    public Map<Integer, Menu> getMenuMap() {
        return menuMap;
    }

}
