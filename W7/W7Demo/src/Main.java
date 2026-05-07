import Library.Animal;
import Library.Cat;
import Library.Dog;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Animal myAnimal = new Animal();
//        myAnimal.eat();
//        myAnimal.eat(5);
//        myAnimal.makeSound();

//        Cat myCat = new Cat();
//        myCat.eat();
//        myCat.eat(4);
//        myCat.makeSound();
//        myCat.getLitterPreference("Fresh Step");

//        Dog myDog = new Dog();
//        myDog.eat();
//        myDog.eat(5);
//        myDog.makeSound();

        List<Animal> myAnimals = new ArrayList<>();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myAnimal = new Animal();

        myAnimals.add(myDog);
        myAnimals.add(myCat);
        myAnimals.add(myAnimal);

        System.out.println("You have " + myAnimals.size() + " animals in your list!");

        for (var animal: myAnimals) {
            animal.eat();
            animal.makeSound();
        }
    }
}