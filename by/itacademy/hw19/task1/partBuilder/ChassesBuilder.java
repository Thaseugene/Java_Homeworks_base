package by.itacademy.hw19.task1.partBuilder;

import by.itacademy.hw19.task1.interfaces.ILineStep;
import by.itacademy.hw19.task1.entity.ProductPart;

public class ChassesBuilder implements ILineStep {
    
    @Override
    public ProductPart buildProductPart() {
        System.out.println("New chasses has been created and sent to assembly line");
        trySleep();
        return new ProductPart(ProductPartTypes.CHASSES.getPartType());
    }

    private void trySleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
