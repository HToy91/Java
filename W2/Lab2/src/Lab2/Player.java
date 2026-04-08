package Lab2;

public class Player {
    static int ties;
    String name;
    int score;

    String[] moves = {"rock", "paper", "scissors"};

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
