package home.task13_14;

public class Logarithm implements Calculator {
    public double resultFor(double left, double right) {
        return Math.log(left)/Math.log(right);
    }
}
