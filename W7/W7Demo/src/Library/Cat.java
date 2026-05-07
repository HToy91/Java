package Library;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("The Cat is Eating!");
    }

    public void getLitterPreference(String litterName) {
        System.out.println("The cat loves the litter brand: " + litterName);
    }
}
