package Library;

public class Sorcerer extends Mage {
    @Override
    public void catchPhrase() {
        System.out.println("By the power of magic...");
    }

    @Override
    public void attack(String attack) {
        System.out.println("The Sorcerer used " + attack + "!");
    }
}
