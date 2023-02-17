import java.util.Scanner;
public class Mars {
    /** NAME: main();
     * Defines variables colonyName, shipPopulation, and meals.
     * Calls a method landingCheck with parameter 5 and stores the result in boolean variable landing.
     * Updates meals variable by subtracting 75% of shipPopulation times 2.
     * Prints current meals value.
     * Updates meals variable by adding 50% of current meals value.
     * Prints current meals value.
     * Updates shipPopulation variable by adding 5.
     * Prints current shipPopulation value.
     * Defines variable landingLocation and assigns it a value of "The Ocean".
     * Prints a request to land at landingLocation.
     * Checks if landingLocation equals "The Plain" and prints respective message.
     * Prompts user for input to play a guessing game and stores result in String variable answer.
     * If answer equals "yes", creates a new GuessingGame object, else prints "Okay, maybe next time.".
     * Prints message "Let's prepare to explore!".
     * Creates a new MarsExpedition object.
     * Sends a goodbye message as well as a YOU SURVIVED! message.
     * @param args
     */
    public static void main(String[] args) {
        String colonyName = "martianLove";
        int shipPopulation = 300;
        double meals = 4000.00;
        System.out.println("Landing Check:");
        boolean landing = landingCheck(5);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMeals after Landing:");
        meals = meals - ((shipPopulation * 0.75) * 2);
        System.out.println("meals: " + meals);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nMeals after extra crate of food:");
        meals = meals + meals * 0.5;
        System.out.println("meals: " + meals);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n5 babies born in 2 days!");
        shipPopulation = shipPopulation + 5;
        System.out.println("Ship Population: " + shipPopulation);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String landingLocation = "The Ocean";
        System.out.println("\nrequest landing: " + landingLocation);
        if (landingLocation.equals("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("Error!!! Flight plan already set. Landing on The Plain");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nWould you like to play a guessing game? yes/no");
        String answer = input.next();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (answer.equalsIgnoreCase("yes")) {
            new GuessingGame();
        } else {
            System.out.println("Okay, maybe next time.");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Let's prepare to explore!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new MarsExpedition();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("YOU SURVIVED!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank you for playing! \n I hope you enjoyed. :)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * Function name: landingCheck
     * Inside:
     * 1. loop for conditions if minutes left should have you turn or not and in what direction
     * 2. Thread.sleep(250) between minutes to make it user friendly
     * 3. catch set up for thread.sleep
     * 4. Once loop is done, print Landed
     * 5. redefine the landing boolean to false
     * @param minutesLeft
     * @return
     */
    public static boolean landingCheck(int minutesLeft) {
        for (int i = 0; i <= minutesLeft; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Keep Center");
            } else if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Right");
            } else if (i % 3 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Left");
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Landed");
        return false;
    }
}