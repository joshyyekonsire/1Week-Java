import java.util.Scanner;

public class MarsExpedition {

    /**
     * NAME: MarsExpedition();
     * Initializes a new MarsExpedition class with a delay of 1 second.
     * Prompts the user to input their name with a delay of 1 second.
     * Asks the user if they are ready to begin with a delay of 1 second.
     * Prompts the user to input the size of their team with a delay of 1 second.
     * Asks the user to select a snack to bring with them with a delay of 1 second.
     * Asks the user to select a vehicle to explore The Plain, providing a list of options.
     * Displays the team's details with a countdown from 5 to 1, each count with a delay of 1 second.
     * Sends a goodluck message.
     */
    public MarsExpedition() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nInitializing startup");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Beep");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boop");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Beeeeeeeep");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boooooooop");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Startup is complete");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...........");
        System.out.println("\nWhat is your name?");
        String name = userInput.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello " + name + "! Are you ready to begin? Type Y or N");
        String ready = userInput.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ready.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nHow many people do you want on your team? (There are only 3 seats in the pod)");
        int teamSize = userInput.nextInt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (teamSize < 1) {
            System.out.println("You need at least one other person on your team.");
            teamSize = 1;
        } else if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else {
            System.out.println("Great, you have chosen " + teamSize + " team members.");
        }
        userInput.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nYou are allowed to bring one snack with you. What do you want to bring?");
        String treat = userInput.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Nice choice, you will be bringing a " + treat + " with you");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nChoose a vehicle to explore The Plain: " +
                "\nA: Jeep" +
                "\nB: Ford F250" +
                "\nC: Prius" +
                "\nD: Harley Davidson");
        String userVehicle = userInput.nextLine();
        String vehicleName;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (userVehicle.equalsIgnoreCase("A")) {
            vehicleName = "Jeep";
        } else if (userVehicle.equalsIgnoreCase("B")) {
            vehicleName = "Ford F250";
        } else if (userVehicle.equalsIgnoreCase("C")) {
            vehicleName = "Prius";
        } else if (userVehicle.equalsIgnoreCase("D")) {
            vehicleName = "Harley Davidson";
        } else {
            vehicleName = "your feet";
            userVehicle = "None";
        }
        System.out.println("You have selected " + vehicleName + " (" + userVehicle + ")");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are ready to explore! You are not very well prepared but you are a strong human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nHere is your team and equipment: ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nCaptain: " + name + "." +
                "\n------------------------------------" +
                "\nTeam size: " + teamSize +
                "\nSnack: " + treat +
                "\nVehicle: " + vehicleName +
                "\n------------------------------------" +
                "\nCountdown.....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
            System.out.println(" 5");
            Thread.sleep(1000);
            System.out.println(" 4");
            Thread.sleep(1000);
            System.out.println(" 3");
            Thread.sleep(1000);
            System.out.println(" 2");
            Thread.sleep(1000);
            System.out.println(" 1");
            Thread.sleep(1000);
            System.out.println(" Good luck!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new FindingsList();
    }
}