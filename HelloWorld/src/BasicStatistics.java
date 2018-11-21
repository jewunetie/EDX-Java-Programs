
import java.util.Scanner;

public class BasicStatistics {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number:");
        int number1 = input.nextInt();
        System.out.println("Give me another number:");
        int number2 = input.nextInt();
        System.out.println("Give me a third number:");
        int number3 = input.nextInt();
        System.out.println("Give me a fourth number:");
        int number4 = input.nextInt();
        System.out.println("Give me a final number:");
        int number5 = input.nextInt();

        //Average
        int average = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("The average is " + average);

        //Min
    }
}
