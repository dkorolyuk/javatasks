package home.task13;

import java.util.Scanner;

public class StartCalculator {

    public double calculate(double val1, double val2, String operator) {
        Calculator operation = getOperationFor(operator);
        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }



    private Calculator getOperationFor(String operator) {

        switch (operator) {
            case "*":
                return new Multiplication();
            case "-":
                return new Substraction();
            case "+":
                return new Add();
            case "^":
                return new Exponentiation();
            case "log":
                return new Logarithm();
            case "sqrt":
                return new Root();
            case "/":
                return new Division();
            default:
                return null;
        }
    }



    public static void main(String[] args){
        String expression;
        System.out.println("Введите выражение");
        Scanner scan = new Scanner(System.in);
        expression = scan.nextLine();
        String [] expArr = expression.split(" ");
        double val1 = 0;
        double val2 = 0;
        try {
             val1 = Double.valueOf(expArr[0]);
             val2 = Double.valueOf(expArr[2]);
        } catch (RuntimeException e){
            System.err.println("Invalid arguments");
        }
        String operator = expArr[1];

        StartCalculator calculator = new StartCalculator();
        System.out.println( calculator.calculate(val1, val2, operator) );
    }


}
