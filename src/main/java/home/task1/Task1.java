package home.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        resultLong();
        resultInt();
        resultFloat();
        resultDouble();
    }

    public static void resultLong(){
        Scanner scLong = new Scanner(System.in);
        System.out.println("Enter x");
        long x = scLong.nextLong();
        System.out.println("Enter y");
        long y = scLong.nextLong();
        System.out.println("Enter z");
        long z = scLong.nextLong();
        System.out.println("Enter n");
        long n = scLong.nextLong();
        long res = x -(y + 123)/ z * n;
        System.out.printf("Result of x -(y + 123)/ z * n is %d %n",res);
    }

    public static void resultInt(){
        Scanner scInt = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scInt.nextInt();
        System.out.println("Enter y");
        int y = scInt.nextInt();
        System.out.println("Enter z");
        int z = scInt.nextInt();
        System.out.println("Enter n");
        int n = scInt.nextInt();
        int res = (x + (50 - y * z)/n) - x;
        System.out.printf("Result of (x + (50 - y * z)/n) - x is %d %n",res);
    }

    public static void resultFloat(){
        Scanner scFloat = new Scanner(System.in);
        System.out.println("Enter x");
        float x = scFloat.nextFloat();
        System.out.println("Enter y");
        float y = scFloat.nextFloat();
        System.out.println("Enter z");
        float z = scFloat.nextFloat();
        System.out.println("Enter n");
        float n = scFloat.nextFloat();
        float res = x / (y * (z - 1) - 564) + n;
        System.out.printf("Result of x / (y * (z - 1) - 564) + n is %f %n",res);
    }

    public static void resultDouble(){
        Scanner scDouble = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scDouble.nextDouble();
        System.out.println("Enter y");
        double y = scDouble.nextDouble();
        System.out.println("Enter z");
        double z = scDouble.nextDouble();
        System.out.println("Enter n");
        double n = scDouble.nextDouble();
        double res = x / (y * (z - 1) - 564) + n;
        System.out.printf("Result of x / (y * (z - 1) - 564) + n is %f %n",res);
    }
}
