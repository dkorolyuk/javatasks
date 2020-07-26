package home.task5;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task5 {
    public static void main(String[] args) {
        Scanner sLong = new Scanner (System.in);
        System.out.println("Enter long number");
        long l = sLong.nextLong();
        String ls = ""+l;
        long[] lArray = new long[ls.length()];

        for (int i = 0; i < ls.length(); i++){
            lArray [i] = l % 10;
            l = l/10;
        }
        sort(lArray);

        System.out.println("the minimum number is " + lArray[0]);
        System.out.println("the minimum number is " + lArray[ls.length() - 1]);

    }
}
