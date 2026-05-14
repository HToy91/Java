package Library;

public class Warlock extends Mage {
    @Override
    public void catchPhrase() {
        System.out.println("Dormammu, I've come to bargain.");
    }

    public void attack(String attack) {
        System.out.println("The Warlock casts " + attack + "!");
    }
}
