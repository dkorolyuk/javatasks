package home.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array length");
        int arLength = s.nextInt();
        int[] arInt = new int[arLength];
        int[] arIntDivided = new int[arLength];

        System.out.println("Your array is:");
        for(int i = 0; i < arLength; i++){
            arInt[i] = (int)(Math.random() * ((10 - 5) + 1));
            System.out.print(arInt[i] + ", ");

        }
        System.out.println("Your array divided by 3 is:");
        for(int j = 0; j < arLength; j++){
            arIntDivided[j] = arInt[j]/3;
            System.out.print(arIntDivided[j] + ", ");
        }

    }
}
