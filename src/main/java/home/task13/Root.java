package home.task13;

public class Root implements Calculator {
    public double resultFor(double left, double right) {
        return Math.pow(right,1.0/left);
    }
}
