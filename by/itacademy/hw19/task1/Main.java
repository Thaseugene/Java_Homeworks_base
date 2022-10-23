package by.itacademy.hw19.task1;

import by.itacademy.hw19.task1.entity.Product;
import by.itacademy.hw19.task1.partBuilder.BodyBuilder;
import by.itacademy.hw19.task1.partBuilder.ChassesBuilder;
import by.itacademy.hw19.task1.partBuilder.EngineBuilder;
import by.itacademy.hw19.task1.productBuilder.ProductBuilder;

public class Main {

    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder(new BodyBuilder(), new ChassesBuilder(), new EngineBuilder());

        productBuilder.assembleProduct(new Product());

    }
}
