package by.itacademy.hw20.task1.actions.collectors;

import by.itacademy.hw20.task1.actions.Action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ActionsCollector {
    private final Map<String, Action> actionsMap;


    public ActionsCollector(Action[] actions) {
        this.actionsMap = new HashMap<>();
        init(actions);

    }

    private void init(Action[] actions) {
        AtomicInteger iterator = new AtomicInteger(1);
        Arrays.stream(actions)
                .forEach(action -> actionsMap.put(String.valueOf(iterator.getAndIncrement()), action));
    }

    public Map<String, Action> getActionsMap() {
        return actionsMap;
    }
}

