package home.task13_14;

public class Root implements Calculator {
    public double resultFor(double left, double right) {
        return Math.pow(right,1.0/left);
    }
}
