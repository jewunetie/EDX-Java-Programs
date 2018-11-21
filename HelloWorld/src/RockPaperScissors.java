import java.util.Scanner;

// this is a rock, paper, scissors game between the user and the computer
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // the main heart of the game
        game();

        // checks if the user wants to play again or not
        boolean value = false;
        do {
            System.out.print("Do you want to try again? ");
            String again = input.nextLine();

            if (again.equalsIgnoreCase("yes")) {
                game();
            } else if (again.equalsIgnoreCase("no")) {
                value = true;
            } else {
                System.out.println("Error: invalid input. Please try again.");
            }
        } while (value == false);

        System.out.println("Thank you for playing!");
    }

    // the main heart of the game
    public static void game(){
        Scanner input = new Scanner(System.in);
        int userInput = 21;

        //get from user a valid input of either rock, paper, or scissors
        do {
            System.out.print("Rock, Paper, Scissors... ");
            String user = input.nextLine();

            if (user.equalsIgnoreCase("rock")) {
                userInput = 0;
            } else if (user.equalsIgnoreCase("paper")) {
                userInput = 1;
            } else if (user.equalsIgnoreCase("scissors")) {
                userInput = 2;
            } else {
                System.out.println("Error: invalid input. Please try again.");
            }

        } while (userInput == 21);

        // computer decides either rock, paper or scissors and outputs it
        int compOutput = (int)((Math.random() * 100) % 3);
        String output;

        if (compOutput == 0){
            output = "Rock";
        } else if (compOutput == 1){
            output = "Paper";
        } else{
            output = "Scissors";
        }

        System.out.println("The computer has chosen " + output + "!");


        // checks if user won or lost
        if (userInput == compOutput){
            System.out.println("WOW! What a coincidence!");
        } else if (userInput == 0 && compOutput == 2){
            System.out.println("CONGRATULATIONS! YOU WON!");
        } else if (userInput > compOutput) {
        System.out.println("CONGRATULATIONS! YOU WON!");
        } else{
        System.out.println("Sorry :( You were outsmarted by a computer.");
        }
    }
}

