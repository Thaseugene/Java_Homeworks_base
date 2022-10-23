package by.itacademy.hw19.task1.entity;

import by.itacademy.hw19.task1.interfaces.IProduct;

public class Product implements IProduct {

    private ProductPart body;
    private ProductPart chasses;
    private ProductPart engine;

    public boolean isBodyInstalled() {
        return isBodyInstalled;
    }

    public void setBodyInstalled(boolean bodyInstalled) {
        isBodyInstalled = bodyInstalled;
    }

    public boolean isChassesInstalled() {
        return isChassesInstalled;
    }

    public void setChassesInstalled(boolean chassesInstalled) {
        isChassesInstalled = chassesInstalled;
    }

    public boolean isEngineInstalled() {
        return isEngineInstalled;
    }

    public void setEngineInstalled(boolean engineInstalled) {
        isEngineInstalled = engineInstalled;
    }

    private boolean isBodyInstalled;
    private boolean isChassesInstalled;
    private boolean isEngineInstalled;


    @Override
    public void installFirstPart(ProductPart body) {
        setBodyInstalled(true);
    }

    @Override
    public void installSecondPart(ProductPart chasses) {
        setChassesInstalled(true);

    }

    @Override
    public void installThirdPart(ProductPart engine) {
        setEngineInstalled(true);
    }
}
