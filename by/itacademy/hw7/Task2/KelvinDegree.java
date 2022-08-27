package by.itacademy.hw7.task2;

public class KelvinDegree {

    private static final double ABSOLUTE_ZERO = 273.15;

    protected double value;

    public KelvinDegree(double value) {
        this.value = value;
    }

    protected double Convertion() {
            return ABSOLUTE_ZERO + value;
    }
}
