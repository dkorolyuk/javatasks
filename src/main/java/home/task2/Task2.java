package home.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanDigit = new Scanner(System.in);
        System.out.println("Enter 5digit number");
        int theDigit = scanDigit.nextInt();

        for (int i = 0; i < 5; i++){
            System.out.println(theDigit%10);
            theDigit = theDigit/10;
        }
    }
}
