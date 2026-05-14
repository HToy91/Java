import Library.Mage;
import Library.Sorcerer;
import Library.Warlock;
import Library.Wizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MageFunctions {
    public static void MageList(Scanner scanner) {
        String answer;
        List<Mage> mageList = new ArrayList<>();

        do {
            mageList.add(EnterMage(scanner));

            System.out.println("Would you like to enter another Mage(Y/N)?");
            answer = scanner.nextLine();

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Invalid input, please enter Y or N");
                answer = scanner.nextLine();
            }
            
        } while (answer.equalsIgnoreCase("y"));

        DisplayMageList(mageList);
    }

    private static void DisplayMageList(List<Mage> mageList) {
    }

    public static Mage EnterMage(Scanner scanner) {
        System.out.print("Enter the name of the mage: ");
        String name = scanner.nextLine().trim().replaceAll("\\s+", " ");

        System.out.print("Enter type of Mage(Sorcerer, Wizard, or Warlock): ");
        String type = scanner.nextLine().trim().replaceAll("\\s+", " ");

        System.out.print("Please enter his attack");
        String attack = scanner.nextLine().trim().replaceAll("\\s+", " ");

        return switch (type.toLowerCase()) {
            case "sorcerer" -> new Sorcerer();
            case "wizard" -> new Wizard();
            case "warlock" -> new Warlock();
            default -> new Mage();
        };
    }
}
