package Library;

public class Wizard extends Mage {
    public void catchPhrase() {
        System.out.println("You shall not pass!");
    }

    public void attack(String attack) {
        System.out.println("The Wizard casts " + attack + "!");

    }
}
