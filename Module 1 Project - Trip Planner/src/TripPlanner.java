import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] arg){
        greeting();
        System.out.println("***********\n\n");
        timeBudget();
        System.out.println("***********\n\n");
        timeDifference();
        System.out.println("***********\n\n");
        area();
        System.out.println("***********\n\n");
        howFar();
        System.out.println("***********\n\n");

    }

    public static void greeting(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip");
    }

    // Figures out the time it takes to travel and the amount of money it will cost per day
    public static void timeBudget(){
        System.out.print("How many days are you going to spend travelling? ");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double dollars = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double exchangeRate = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("\nIf you are travelling for " + days + " days that is the same as " + hours +
                            " hours or " + minutes + " minutes");
        double perDay = dollars / days;
        perDay *= 100;
        int intPerDay = (int)perDay;
        perDay = (double)intPerDay / 100;
        System.out.println("If you are going to spend $" + dollars + " USD that means per day you can spend up to $" +
                            perDay + " USD");
        double exchangeTotal = dollars * exchangeRate;
        exchangeTotal *= 100;
        int intExchangeTotal = (int)exchangeTotal;
        exchangeTotal = (double)intExchangeTotal / 100;
        double exchangePerDay = exchangeTotal / days;
        exchangePerDay *= 100;
        int intExchangePerDay = (int)exchangePerDay;
        exchangePerDay = (double)intExchangePerDay / 100;
        System.out.println("Your total budget in MXC is " + exchangeTotal + " " + currency + ", which per day is " +
                            exchangePerDay + " " + currency);

    }

    //The time difference between home and destination
    public static void timeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Scanner input = new Scanner(System.in);
        int hourDiff = input.nextInt();
        hourDiff %= 24;
        int noonDiff = 12 + hourDiff;
        System.out.println("That means that when it is midnight at home it will be " + hourDiff +
                            ":00 in your travel destination and when it is noon at home it will be " +
                            noonDiff + ":00");
    }

    public static void area(){
        System.out.print("What is the square area of your destination country in km2? ");
        Scanner input = new Scanner(System.in);
        double sqKm = input.nextDouble();
        double sqMiles = sqKm * 0.62137;
        sqMiles *= 100;
        int intSqMiles = (int)sqMiles;
        sqMiles = (double)intSqMiles / 100;
        System.out.println("In miles2 that is " + sqMiles);
    }

    public static void howFar(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the latitude of your home coordinate? (in radians) ");
        double homeLat = input.nextDouble();
        System.out.print("What is the longitude of your home coordinate? (in radians) ");
        double homeLong = input.nextDouble();
        System.out.print("What is the latitude of your travel destination coordinate? (in radians) ");
        double travelLat = input.nextDouble();
        System.out.print("What is the longitude of your travel destination coordinate? (in radians) ");
        double travelLong = input.nextDouble();
        double sinLat = Math.pow(Math.sin((travelLat - homeLat) / 2), 2);
        double cosLat = Math.cos(homeLat) * Math.cos(travelLat);
        double sinLong = Math.pow(Math.sin((travelLong - homeLong) / 2), 2);
        double distance = 2 * 6378.137 * (Math.asin(Math.sqrt(sinLat + cosLat * sinLong)));
        System.out.println("The distance between your home and your travel destination is " + distance +" km");
    }

}
