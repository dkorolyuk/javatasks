package home.task10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        Pattern name = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
        Pattern phone = Pattern.compile("\\+380\\d{7}");
        Pattern email = Pattern.compile("\\w+?-?\\w+?@[a-z]+.[a-z]+");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String strName = s.nextLine();
        Matcher mName = name.matcher(strName);
        System.out.println("Enter your phone");
        String strPhone = s.nextLine();
        Matcher mPhone = phone.matcher(strPhone);
        System.out.println("Enter your email");
        String strEmail = s.nextLine();
        Matcher mEmail = email.matcher(strEmail);

        if (!mName.matches()){
            System.out.println(strName);
        }

        if (!mPhone.matches()){
            System.out.println(strPhone);
        }

        if (!mEmail.matches()){
            System.out.println(strEmail);
        }

    }
}
