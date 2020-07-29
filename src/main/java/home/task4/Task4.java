package home.task4;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String s1 = "Course: Java core";
        String s2 = "Student";
        String s3 = "Daria Koroliuk";
        if(s3.length() % 2 == 0) s3 = s3 + " ";
        int borderLength = Math.max(s1.length(), s3.length()) + 4;

        printAsterix(borderLength);
        printString(s1, borderLength, s1.length());
        printString(s2, borderLength, s2.length());
        printString(s3, borderLength, s3.length());
        printAsterix(borderLength);

    }
    public static void printWhiteSpace(int borderLength, int stringLength){
            for (int i = 0; i < ((borderLength - stringLength) / 2 - 1); i++) {
                System.out.print(" ");
            }
    }

    public static void printAsterix(int borderLength){
        for (int i = 0; i < borderLength; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printString (String s,int borderlength, int stringLength ){
        System.out.print("*");
        printWhiteSpace(borderlength, stringLength);
        System.out.print(s);
        printWhiteSpace(borderlength, stringLength);
        System.out.print("*");
        System.out.println("");
    }

}
