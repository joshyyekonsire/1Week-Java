import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindingsList {
    /**
     * Name: FingingsList (Constructor)
     * A list of rock samples is generated, but if a "not rock" sample is found, it is removed from the list.
     * The user is prompted to select a fossil to learn more about, and a corresponding description is displayed.
     * A set of supplies before and after an expedition is generated, with certain items added or removed.
     * The function includes various try/catch blocks to handle any InterruptedException that may occur.
     * The function includes several Thread.sleep() calls, which simulate delays and pauses in the function.
     */
    public FindingsList() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nWelcome back! Here is a list of the samples you found:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] samples = new String[4];
        samples[0] = "rock";
        samples[1] = "weird rock";
        samples[2] = "smooth rock";
        samples[3] = "not rock";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All samples have been downloaded: " + Arrays.toString(samples));

        for (int i = 0; i < samples.length; i++) {
            if (samples[i].equals("not rock")) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\nWARNING: Non-rock sample detected. Removing it from the list.");
                samples[i] = null;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        List < String > sampleList = new ArrayList < > (Arrays.asList(samples));
        sampleList.removeAll(Collections.singleton(null));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("List of rock samples: " + sampleList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nPerfect!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HashMap < String, String > fossilHashMap = new HashMap < > ();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nFossil data downloaded");
        fossilHashMap.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilHashMap.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilHashMap.put("Tooth Fossil", "The tooth from an unknown fossil");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nWhich of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        Scanner input = new Scanner(System.in);
        String learnMore = input.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------");
        if (learnMore.equalsIgnoreCase("Bird")) {
            System.out.println("Title: " + learnMore + "\nDescription: " + fossilHashMap.get("Bird Fossil"));
        } else if (learnMore.equalsIgnoreCase("Fish")) {
            System.out.println("Title: " + learnMore + "\nDescription: " + fossilHashMap.get("Fish Fossil"));
        } else if (learnMore.equalsIgnoreCase("Tooth")) {
            System.out.println("Title: " + learnMore + "\nDescription: " + fossilHashMap.get("Tooth Fossil"));
        }
        System.out.println("------------------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HashSet < String > suppliesBefore = new HashSet < > ();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        suppliesBefore.add("Oxygen tank");
        suppliesBefore.add("Satellite phone");
        suppliesBefore.add("First aid kit");
        suppliesBefore.add("Water bottle");
        suppliesBefore.remove("Satellite phone");
        System.out.println("\nSupplies Before Expedition: " + suppliesBefore);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HashSet < String > suppliesAfter = new HashSet < > ();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        suppliesAfter.add("Map");
        suppliesAfter.add("Flashlight");
        suppliesAfter.add("Solar charger");
        suppliesAfter.add("Energy bars");
        System.out.println("\nSupplies After Expedition: ");
        Iterator < String > itrAfter = suppliesAfter.iterator();
        while (itrAfter.hasNext()) {
            System.out.println(itrAfter.next());
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        suppliesAfter.remove("Flashlight");
        System.out.println("\nRemoving Flashlight...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nSupplies After Expedition: ");
        itrAfter = suppliesAfter.iterator();
        while (itrAfter.hasNext()) {
            System.out.println(itrAfter.next());
        }



    }
}