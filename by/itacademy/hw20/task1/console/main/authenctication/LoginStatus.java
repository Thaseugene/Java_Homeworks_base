package by.itacademy.hw20.task1.console.main.authenctication;

public class LoginStatus {
    private static LoginStatus instance;

    private LoginStatus() {

    }

    private boolean isEntered = false;

    public static LoginStatus getInstance() {
        if(instance == null) {
            instance = new LoginStatus();
        }
        return instance;
    }
    public boolean isEntered() {
        return isEntered;
    }

    public void setEntered(boolean entered) {
        isEntered = entered;
    }
}
