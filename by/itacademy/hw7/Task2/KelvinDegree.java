package by.itacademy.hw7.Task2;

import java.math.RoundingMode;

public class KelvinDegree {

    static final double absoluteZero = 273.15;

    protected double value;

    public KelvinDegree() {
    }

    public KelvinDegree(double value) {
        this.value = value;
    }

    protected double Convertion() {
            return absoluteZero + value;
    }
}
