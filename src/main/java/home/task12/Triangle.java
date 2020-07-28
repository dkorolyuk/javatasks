package home.task12;

import java.util.Scanner;

public class Triangle extends Point{
    Point a = generatePoint();
    Point b = generatePoint();
    Point c = generatePoint();
    float sideOne = distance(a, b);
    float sideTwo = distance(b, c);
    float sideThree = distance(c, a);
    float semiPerimeter = calculatePerimeter(sideOne, sideTwo, sideThree) / 2;

    Triangle(){
        Point a = generatePoint();
        Point b = generatePoint();
        Point c = generatePoint();
    }

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle[] tArray = new Triangle[100000];
        for (int i = 0; i < 100000; i++){
            tArray[i] = new Triangle();
        }

        System.out.println("Chose triangle type (equilateral, isosceles, rectangular or arbitrary)");
        Scanner s = new Scanner(System.in);
        String chosenType = s.nextLine();

          for (int i = 0;; i++){
            if (tArray[i].getType(tArray[i].sideOne, tArray[i].sideTwo, tArray[i].sideThree).equals(chosenType)){
                System.out.println("You chose " + chosenType);
                System.out.println("Perimeter is " + tArray[i].calculatePerimeter(tArray[i].sideOne,tArray[i].sideTwo, tArray[i].sideThree));
                System.out.println("Square is " + tArray[i].calculateSquare(tArray[i].sideOne,tArray[i].sideTwo, tArray[i].sideThree, tArray[i].semiPerimeter ));
                return;
            };
        }


    }

    public float calculatePerimeter (float sideOne, float sideTwo, float sideThree){
        //System.out.println(sideOne + sideTwo + sideThree + " perimeter");
        return sideOne + sideTwo + sideThree;
    }

    public float calculateSquare (float sideOne, float sideTwo, float sideThree,float semiPerimeter){
        //System.out.println(Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree)) + " square");
        return (float) Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
    }

    public String getType (float sideOne, float sideTwo, float sideThree){
        if ((int)sideOne == (int)sideTwo && (int)sideOne == (int)sideThree){
            return "equilateral";
        }else if ((int)sideOne == (int)sideTwo || (int)sideOne == (int)sideThree){
            return  "isosceles";
        }else if (((int)sideOne * (int)sideOne + (int)sideTwo * (int)sideTwo == (int)sideThree * (int)sideThree) ||
                ((int)sideOne * (int)sideOne + (int)sideThree * (int)sideThree == (int)sideTwo * (int)sideTwo)||
                ((int)sideTwo * (int)sideTwo + (int)sideThree * (int)sideThree == (int)sideOne * (int)sideOne)){
            return "rectangular";
        }
        return "arbitrary";
    }

}
