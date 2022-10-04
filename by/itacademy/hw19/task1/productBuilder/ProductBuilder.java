package by.itacademy.hw19.task1.productBuilder;

import by.itacademy.hw19.task1.interfaces.IAssemblyLine;
import by.itacademy.hw19.task1.entity.Product;
import by.itacademy.hw19.task1.partBuilder.BodyBuilder;
import by.itacademy.hw19.task1.partBuilder.ChassesBuilder;
import by.itacademy.hw19.task1.partBuilder.EngineBuilder;

public class ProductBuilder implements IAssemblyLine {

    private final BodyBuilder bodyBuilder;

    private final ChassesBuilder chassesBuilder;

    private final EngineBuilder engineBuilder;

    public ProductBuilder(BodyBuilder bodyBuilder, ChassesBuilder chassesBuilder, EngineBuilder engineBuilder) {
        this.bodyBuilder = bodyBuilder;
        this.chassesBuilder = chassesBuilder;
        this.engineBuilder = engineBuilder;
    }

    @Override
    public Product assembleProduct(Product product) {
        do {
            product.installFirstPart(bodyBuilder.buildProductPart());
            System.out.println("Body has been installed");
            trySleep();
            product.installSecondPart(chassesBuilder.buildProductPart());
            System.out.println("Chasses has been installed");
            trySleep();
            product.installSecondPart(engineBuilder.buildProductPart());
            System.out.println("Engine has been installed");
            trySleep();
        } while (!product.isBodyInstalled() && !product.isChassesInstalled() && !product.isEngineInstalled());
        trySleep();
        System.out.println("Quality has been checked. New car has been created.");
        return product;
    }

    private void trySleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }



}
