package by.itacademy.hw19.task1.entity;

import by.itacademy.hw19.task1.interfaces.IProductPart;

public class ProductPart implements IProductPart {

    private final String type;

    public ProductPart(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
