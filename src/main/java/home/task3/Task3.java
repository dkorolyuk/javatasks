package home.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter X");
        int x = s.nextInt();
        System.out.println("Enter Y");
        int y = s.nextInt();
        System.out.println("Enter Z");
        int z = s.nextInt();
        double vectorLength = Math.sqrt(x*x + y*y + z*z);

        System.out.printf("The unit vector for your coordinates is %d, %d, %d", Math.round(x/vectorLength),Math.round(y/vectorLength),Math.round(z/vectorLength));
    }
}
