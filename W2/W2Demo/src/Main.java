import Week2.GuessingGame;
import Week2.Mathematics;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Mathematics.CalculatorWhile(scanner);
//        Mathematics.CalculatorDoWhile(scanner);
//        GuessingGame.Play(scanner);
        scanner.close();

        scanner.close();
        }
    }