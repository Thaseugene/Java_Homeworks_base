package by.itacademy.hw19.task1.partBuilder;

public enum ProductPartTypes {

    ENGINE ("Engine"),
    BODY ("Body"),
    CHASSES ("Chasses");

    private String partType;

    ProductPartTypes(String partType) {
        this.partType = partType;
    }

    public String getPartType() {
        return partType;
    }
}
