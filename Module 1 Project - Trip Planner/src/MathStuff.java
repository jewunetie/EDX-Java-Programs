import java.util.Scanner;

public class MathStuff {
    public static void main(String[] args){
        //circle();
        goldenRatio();
    }

    public static void circle(){
        Scanner input = new Scanner(System.in);
        System.out.print("We are going to figure out the area of a circle!\nWhat is circumference of the circle? ");
        double circum = input.nextDouble();
        double radius = circum / (2 * Math.PI);
        double area = Math.pow(radius, 2) * Math.PI;
        area *= 100;
        area = Math.round(area);
        area = area / 100;
        System.out.println("The area is " + area);
    }

    public static void goldenRatio(){
        double phi = (1 + Math.sqrt(5)) / 2;
        System.out.println(phi);
    }



}
