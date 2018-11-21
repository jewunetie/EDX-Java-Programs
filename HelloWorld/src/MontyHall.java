import java.util.Scanner;

public class MontyHall {
    public static void main(String[] arg){

        // selections for how many rounds to do the test
        Scanner input = new Scanner(System.in);
        System.out.print("How many rounds do you want the game to go through? ");
        int x = input.nextInt();

        // declaring variables
        int winSwitch = 0;
        int winStay = 0;
        int total = 0;

        // the main game going through x amount of iterations or rounds
        for (int i = 1; i <= x; i++){

            // randomly choosing the winning door
            int winDoor = (int)((Math.random() * 100) % 3);

            // randomly choosing the door of choice
            int chosenDoor = (int)((Math.random() * 100) % 3);

            // choosing the losing doors based on the winning door
            int loseDoor1;
            int loseDoor2;
            if (winDoor == 0){
                loseDoor1 = 1;
                loseDoor2 = 2;
            } else if (winDoor == 1){
                loseDoor1 = 0;
                loseDoor2 = 2;
            } else {
                loseDoor1 = 0;
                loseDoor2 = 1;
            }

            // closing one of the losing doors based on the winning door and the chosen door
            int closedDoor;
            if (winDoor == chosenDoor){
                int flip = (int)Math.round(Math.random());
                if (flip == 0){
                    closedDoor = loseDoor1;
                } else{
                    closedDoor = loseDoor2;
                }

            } else{
                if (loseDoor1 == chosenDoor){
                    closedDoor = loseDoor1;
                } else{
                    closedDoor = loseDoor2;
                }
            }

            // if staying with the chosen door
            if (chosenDoor == winDoor){
                winStay++;
            }

            // if switching to the other closed door
            else{
                winSwitch++;
            }

            //counting the total games
            total++;

        }

        // calculations for total wins if staying with original choice
        double stayRatio = ((double)winStay) / ((double)total);
        System.out.println("Stay: " + stayRatio);

        // calculations for total wins if switching from original choice
        double switchRatio = ((double)winSwitch) / ((double)total);
        System.out.println("Switch: " + switchRatio);

    }
}
