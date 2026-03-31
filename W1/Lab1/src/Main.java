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

        String [] splitName = Helpers.splitName(name);
        String fName = splitName[0];
        String lName = (splitName.length > 1) ? splitName[1] + ", " : "";

        System.out.println("Please enter your Date of Birth");
        String dateOfBirth = scanner.nextLine();

        System.out.println(lName + fName + " has a Date of Birth is " + dateOfBirth);
    }
}