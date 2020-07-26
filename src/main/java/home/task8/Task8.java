package home.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.nextLine();
        String[] words = str.split(" ");
        System.out.println(newString(words));
    }
    public static StringBuilder newString (String[] words) {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb = sb.reverse();
            newStr = newStr.append(sb + " ");
        }
        return newStr;
    }
}
