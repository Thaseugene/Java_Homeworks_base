package by.itacademy.hw20.task1.actions;

public class ActionQuit extends Action{

    @Override
    public void execute() {
        Runtime.getRuntime().halt(0);
    }
}
