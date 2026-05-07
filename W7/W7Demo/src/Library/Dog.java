package Library;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Dog Barks!");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is Eating!");
    }
}
