package Klausur4_Vorbereitung.AbstractClasses_SuperClasses;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof, Woof!");
    }
}
