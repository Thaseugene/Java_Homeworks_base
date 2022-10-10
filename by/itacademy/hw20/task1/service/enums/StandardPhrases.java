package by.itacademy.hw20.task1.service.enums;

public enum StandardPhrases {

    ENTER_LOG("Enter login:"),
    ENTER_PAS("Enter password:"),
    LOGIN_CONDITION("Please create new login. Login should contain only Latin letters, numbers " +
            "and underscore. The length should be from 5 to 20 characters."),
    PASS_CONDITION("Please create your password. Password must contain only Latin " +
            "letters, numbers and underscore character. Length should be longer than " +
            "8 characters"),
    LOGIN_CREATED("Your account successfully created"),
    SIGNED_IN("You successfully signed in"),
    SELECT_INVALID("Selection was invalid"),
    ENTER_REG_NUM("Enter registration number:"),
    ENTER_PROD("Enter producer:"),
    CHOOSE_TYP("Choose type:"),
    CHOOSE_CAR("Choose car that you want to remove or enter \"0\" to leave last menu:"),
    ENTER_M_NAME("Enter car master name:"),
    CHOOSE_MASTER("Choose master that you want to remove or enter \"0\" to leave last menu:"),
    TO_MENU("You are transferring to last menu...."),
    CRT_ORDER_NUM("Create order number:"),
    SET_TIME("Set time that you are going to work with this order (days):"),
    CH_CAR_REPAIR("Choose car from garage that you are going to repair:"),
    CH_MASTER_ORDER("Choose master who is going to work with this order:"),
    NO_CARS_MASTERS("There are no cars in garage or no masters in list. Please, check it."),
    NO_ORDERS("There are no orders"),
    CHANGE_ORDER("Choose order that you are going to change or enter \"0\" to leave last menu:"),
    CHOOSE_STAT("Choose new status for this order:"),
    ORDER_NEW_TIME("Enter new time for order (days)"),
    ORDER_REMOVE("Choose order to remove or enter \"0\" to leave last menu:"),
    NO_CARS("There ara no cars in garage"),
    NO_MASTERS("There are no masters in list");

    private String text;

    StandardPhrases(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
