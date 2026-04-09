package Lab2;

import java.util.Scanner;

public class Game {
    public static void MainMenu (Scanner scanner) {
        System.out.println("Would you like to play a game (Y/N)?");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Invalid input, please enter Y or N");
            answer = scanner.nextLine();
        }

        if (answer.equalsIgnoreCase("n")) {
            System.out.println("Thank you for playing!");
            return;
        }

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        Player player = new Player(name, 0);
        Player computer = new Player("Korg", 0);

        while (answer.equalsIgnoreCase("y")) {
            PlayGame(name, player, computer, scanner);

            System.out.println("Would you like to play again (Y/N)?");
            answer = scanner.nextLine();

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Invalid input, please enter Y or N");
                answer = scanner.nextLine();
            }
        }
        System.out.println("Final Scores");
        System.out.print(player.name + ": " + player.score + " | ");
        System.out.print(computer.name + ": " + computer.score + " | ");
        System.out.println("Ties: " + Player.ties);
        System.out.println("Thank you for playing!");
    }

    public static void PlayGame(String name, Player player, Player computer, Scanner scanner) {

        System.out.println("Welcome " + player.name + " to the game of Rock, Paper, Scissors!");
        System.out.println("Please enter your choice (rock, paper, scissors)");
        String playerChoice = scanner.nextLine();

        String computerChoice = computer.moves[(int) (Math.random() * 3)];
        System.out.println(computer.name + " chose " + computerChoice);

        DetermineWinner(playerChoice, computerChoice, player, computer);

        System.out.println(player.name + "'s score: " + player.score);
        System.out.println(computer.name + "'s score: " + computer.score);
        System.out.println("Ties: " + Player.ties);
    }

    public static void DetermineWinner(String playerChoice, String computerChoice, Player player, Player computer) {
        String result = playerChoice.toLowerCase() + "-" + computerChoice.toLowerCase();

        if (
                !playerChoice.equalsIgnoreCase("rock")
                        && !playerChoice.equalsIgnoreCase("paper")
                        && !playerChoice.equalsIgnoreCase("scissors")
        ) {
            System.out.println("Invalid choice, please enter rock, paper, or scissors");
            return;
        }

        switch (result) {
            case "rock-rock":
            case "paper-paper":
            case "scissors-scissors":
                System.out.println("It's a tie!");
                Player.ties++;
                break;

            case "rock-scissors":
            case "paper-rock":
            case "scissors-paper":
                System.out.println("Congratulations " + player.name + ", you win!");
                player.score++;
                break;

            default:
                System.out.println("Sorry " + player.name + ", " + computer.name +" wins!");
                computer.score++;
        }
    }
}
