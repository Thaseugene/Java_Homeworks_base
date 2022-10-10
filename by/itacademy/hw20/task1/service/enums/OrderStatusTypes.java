package by.itacademy.hw20.task1.service.enums;

public enum OrderStatusTypes {

    NEW ("new"),
    IN_PROGRESS ("in progress"),
    COMPLETED ("completed"),
    CLOSED ("closed"),
    CANCELED ("canceled");

    private String statusType;

    OrderStatusTypes(String statusType) {
        this.statusType = statusType;
    }

    public String getStatusType() {
        return statusType;
    }
}
