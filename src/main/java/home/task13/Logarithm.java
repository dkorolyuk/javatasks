package home.task13;

public class Logarithm implements Calculator {
    public double resultFor(double left, double right) {
        return Math.log(left)/Math.log(right);
    }
}
