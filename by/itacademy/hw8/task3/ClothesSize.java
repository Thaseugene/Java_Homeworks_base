package by.itacademy.hw8.task3;

public enum ClothesSize {
    SIZE_XS ("size XS"),
    SIZE_S ("size S"),
    SIZE_M ("size M"),
    SIZE_L ("size L"),
    SIZE_XL ("size XL"),
    SIZE_XXL ("size XXL");

    private String valueSize;

    ClothesSize(String valueSize) {
        this.valueSize = valueSize;
    }

    public String getValueSize() {
        return valueSize;
    }
}
