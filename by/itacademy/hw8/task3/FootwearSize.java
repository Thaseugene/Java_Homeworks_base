package by.itacademy.hw8.task3;

public enum FootwearSize {

    SIZE_35("size 35"),
    SIZE_36("size 36"),
    SIZE_37("size 37"),
    SIZE_38("size 38"),
    SIZE_39("size 39"),
    SIZE_40("size 40"),
    SIZE_41("size 41"),
    SIZE_42("size 42"),
    SIZE_43("size 43"),
    SIZE_44("size 44"),
    SIZE_45("size 45");

    private String sizeValue;

    FootwearSize(String sizeValue) {
        this.sizeValue = sizeValue;
    }

    public String getSizeValue() {
        return sizeValue;
    }
}
