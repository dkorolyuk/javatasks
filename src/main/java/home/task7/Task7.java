package home.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String forCheck = s.nextLine();
        int strLength = forCheck.length();
        char[] forCheckArr1 = new char[strLength];
        forCheck.getChars(0, strLength, forCheckArr1, 0);
        if(checkIfPalindrome(forCheckArr1)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        }

        public static boolean checkIfPalindrome (char[] forCheckArr){
            int lastChar = forCheckArr.length - 1;
            for(int i = 0; i < forCheckArr.length/2; i ++){
                boolean b = forCheckArr[i] == forCheckArr[lastChar];
                if (!b) return b;
                lastChar--;
            }
            return true;
        }
    }
