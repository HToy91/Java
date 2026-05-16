package Library;

public class Sorcerer extends Mage {
    public Sorcerer(String name, String type, String attack) {
        super(name, type, attack);
    }

    @Override
    public void catchPhrase() {
        System.out.println("By the power of magic...");
    }

    @Override
    public void attack(String attack) {
        System.out.println("The Sorcerer used " + attack + "!");
    }
}
