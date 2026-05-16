package Library;

public class Mage {
    public String name;
    public String type;
    public String attack;

    public Mage(String name, String type, String attack) {
        this.name = name;
        this.type = type;
        this.attack = attack;
    }

    public void catchPhrase() {
        System.out.println("I am the greatest Mage ever!");
    }

    public void attack(String attack) {
        System.out.println(attack.toUpperCase() + " Attack initiated!");
    }
}
