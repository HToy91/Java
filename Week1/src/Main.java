import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Create an output
//        System.out.println("Hello World");
//
//        // Create a variable
//        String name = "Jose";
//        System.out.println("Hello " + name);
//
//        //
//        int num = 25;
//        System.out.println("My favorite number is " + num);
//
//        // Concat
//        String fName = "Jose";
//        String lName = "Vargas Figueroa";
//
//        // Doesn't space out names
//        System.out.println("My name is " + fName.concat(lName));
//
//        // Create a scanner
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        // scanner.nextInt();
//        // scanner.nextDouble();
//
//        System.out.println("You entered " + input);
//
//        String areaCode = Helpers.getAreaCode(input);
//
//        System.out.println("Area code is " + areaCode);
//
////        String stateAbbreviation = Helpers.returnAreaCodeStateAbbrev(areaCode);
//        System.out.println("Your state is " + Helpers.returnAreaCodeStateAbbrev(areaCode));

        // Last 4 digits of our social
        Scanner socialScanner = new Scanner(System.in);
        System.out.println("Enter your social security number");
        String social = socialScanner.nextLine();

        System.out.println("The last four digits of your social are " + Helpers.returnLastFour(social));
    }
}