package by.itacademy.hw20.task1.entity.enums;

public enum OrderStatusType {

    NEW ("new"),
    IN_PROGRESS ("in progress"),
    COMPLETED ("completed"),
    CLOSED ("closed"),
    CANCELED ("canceled");

    private String statusType;

    OrderStatusType(String statusType) {
        this.statusType = statusType;
    }

    public String getStatusType() {
        return statusType;
    }
}
