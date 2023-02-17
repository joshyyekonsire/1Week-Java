import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessingGame {
    private int attempts;
    private boolean correctGuess;
    private int random;
    private Scanner input;

    /**
     * NAME: GuessingGame()
     Constructor for the GuessingGame class

     Initializes the game by setting the number of attempts to 1, initializing the scanner and generating a random number.

     Asks the user for their name and greets them.

     Instructs the user to guess a number between 1 and 100.

     Calls the play() method to start the game.

     */

    public GuessingGame() {
        attempts = 1;
        correctGuess = false;
        input = new Scanner(System.in);
        Random randomNumber = new Random();
        random = randomNumber.nextInt(100);
        System.out.println("Welcome to the Guessing Game!");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter your name:");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String userName = input.nextLine();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello " + userName + "! Let's get started.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        play();
    }

    /** NAME: play();


     Inside:
     while loop to keep the game running until the user guesses the correct number
     Accepts user input and checks if it is within range and a valid number
     Checks if the user's guess is correct, otherwise provides feedback on whether the guess was too high or too low
     If the guess is incorrect, increments the attempts count and continue the loop
     If the guess is correct, sets correctGuess to true and ends the loop
     Prints out the number of attempts taken to guess the correct number
     */

    public void play() {
        while (!correctGuess) {
            try {
                int userGuess = input.nextInt();
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("That's not a valid guess! Please enter a number between 1 and 100.");
                    continue;
                }

                if (userGuess == random) {
                    System.out.println("Congratulations, you guessed it right!");
                    correctGuess = true;
                } else {
                    System.out.println("That's not the number I'm thinking of. Keep trying!");
                    attempts++;

                    if (userGuess < random) {
                        System.out.println("Your guess is too low. Try again!");
                    } else if (userGuess > random) {
                        System.out.println("Your guess is too high. Try again!");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("Oops, that's not a number. Please enter a valid number between 1 and 100.");
                continue;
            }
        }

        System.out.println("You guessed the number in " + attempts + " attempts. Thanks for playing!");
    }
}