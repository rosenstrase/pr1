package Klausur4_Vorbereitung.AbstractClasses_SuperClasses;

public class Tester {
    public static void main(String[] args) {
        Dog newDog = new Dog("Socks");
        Cat newCat = new Cat("Fluffy");

        newDog.makeSound();
        newCat.makeSound();

        System.out.println("Test");
    }
}
