package by.itacademy.hw7.Task2;

public class FahrenheitDegree extends KelvinDegree {

    public FahrenheitDegree() {
    }

    public FahrenheitDegree(double value) {
        super.value = value;
    }

    @Override
    protected double Convertion() {
        return (value * 1.8 + 32.0);
    }
}
