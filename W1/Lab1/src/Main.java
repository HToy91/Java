import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your First and Last Name");
        String name = scanner.nextLine();

        String[] splitName = Helpers.splitName(name);
        String fName = splitName[0];

        if (fName.isEmpty()) {
            System.out.println("Invalid Name");
            return;
        }

        String lName =
                (splitName.length > 1)
                        // If last name contains more than one name like mine
                        ? String.join(" ", Arrays.copyOfRange(splitName, 1, splitName.length))
                        : "";

        System.out.println("Please enter your Date of Birth");
        String dateOfBirth = scanner.nextLine();

        String[] splitDate = Helpers.splitDate(dateOfBirth);

        if (splitDate.length != 3) {
            System.out.println("Invalid Date");
            return;
        }

        String month = splitDate[0];
        String day = splitDate[1];
        String year = splitDate[2];

        // Output
        System.out.println(Helpers.formatOutput(lName, fName, Helpers.formatDate(month, day, year)));
    }
}