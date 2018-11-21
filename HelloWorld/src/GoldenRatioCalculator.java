import java.util.Scanner;

public class GoldenRatioCalculator {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Highest nth (>2) term in the fibonacci sequence: ");
        double nTerm = input.nextDouble();

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        int n3 = 0;
        for (int i = 3; i <= nTerm; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            //System.out.print(n3 +  " ");
        }

        System.out.println(n3);

        //errorCalc(user1,user2);
    }

    public static void errorCalc(double x, double y){
        double error = Math.min(x,y) / Math.max(x,y);
        error -= 1;
        error = Math.abs(error);
        error *= 100;
        System.out.print("The error between " + x + " and " + y + " is " + error + " %");
    }
}
