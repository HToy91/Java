import Library.Mage;
import Library.Sorcerer;
import Library.Warlock;
import Library.Wizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MageFunctions {
    public static void MageList(Scanner scanner) {
        String answer;
        List<Mage> mageList = new ArrayList<>();

        do {
            mageList.add(EnterMage(scanner));

            System.out.print("Would you like to enter another Mage(Y/N)?: ");
            answer = scanner.nextLine();

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.print("Invalid input, please enter Y or N: ");
                answer = scanner.nextLine();
            }

        } while (answer.equalsIgnoreCase("y"));

        DisplayMageList(mageList);
    }

    private static void DisplayMageList(List<Mage> mageList) {
        int listAmount = 0;
        int totalAmount = mageList.size();

        System.out.println("\nYou have " + totalAmount + " Mages on your team!");

        for (var mage : mageList) {
            listAmount++;

            System.out.println(
                    "\nMage " + listAmount
                    + "\n" + "_".repeat(30)
                    + "\nName: " + mage.name
                    + "\nType: " + mage.type.toUpperCase()
            );
            mage.catchPhrase();
            mage.attack(mage.attack);
        }
    }

    public static Mage EnterMage(Scanner scanner) {
        System.out.print("Enter the name of the mage: ");
        String name = scanner.nextLine().trim().replaceAll("\\s+", " ");

        System.out.print("Enter type of Mage(Sorcerer, Wizard, Warlock, or Mage[for default]: ");
        String type = scanner.nextLine().trim().replaceAll("\\s+", " ");

        List<String> typeList = Arrays.asList("sorcerer", "wizard", "warlock", "mage");
        while (!typeList.contains(type.toLowerCase())) {
            System.out.print("Invalid input, please enter Sorcerer, Wizard, Warlock, or Mage: ");
            type = scanner.nextLine().trim().replaceAll("\\s+", " ");
        }

//        while (!type.equalsIgnoreCase("sorcerer") && !type.equalsIgnoreCase("warlock") && !type.equalsIgnoreCase("wizard")) {
//            System.out.print("Invalid input, please enter Sorcerer, Wizard, or Warlock: ");
//            type = scanner.nextLine().trim().replaceAll("\\s+", " ");
//        }

        System.out.print("Please enter his attack: ");
        String attack = scanner.nextLine().trim().replaceAll("\\s+", " ");

        return switch (type.toLowerCase()) {
            case "sorcerer" -> new Sorcerer(name, type, attack);
            case "wizard" -> new Wizard(name, type, attack);
            case "warlock" -> new Warlock(name, type, attack);
            default -> new Mage(name, "mage", attack);
        };
    }
}
