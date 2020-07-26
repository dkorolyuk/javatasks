package home.task6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many developers is working now?");
        int developers = s.nextInt();
        System.out.println("Interview amount is " + interviewCount(developers));


    }
    public static int interviewCount(int developers) {
        int interviewAmount;

        if(developers == 1)
            return 0;
        interviewAmount = interviewCount(developers - 1) + developers - 1;
        return interviewAmount;
    }
}
