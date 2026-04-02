package Week2;

import java.util.Scanner;

public class GuessingGame {
    public static void Play (Scanner scanner) {
        int num = (int) (Math.random() * 10 + 1);

        System.out.println("Please enter a number between 1 and 10");
        int numGuess = scanner.nextInt();

        while (num != numGuess) {
            if (num > numGuess) {
                System.out.println("Too low, try again\nPlease Guess Again!");
//                numGuess = scanner.nextInt();
            } else {
                System.out.println("Too high, try again\nPlease Guess Again!");
//                numGuess = scanner.nextInt();
            }
            numGuess = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number!");
    }
}
