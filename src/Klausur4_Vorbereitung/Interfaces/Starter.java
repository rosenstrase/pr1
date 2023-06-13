package Klausur4_Vorbereitung.Interfaces;

public class Starter {
    public static void main(String[] args) {
        Person pNeu = new Person("Neil", "Porter");
        SWR3 senderNeu = new SWR3("Willkommen bei den Heutenachrichten.");
        senderNeu.anmelden(pNeu);
        senderNeu.sendeNachricht("Cannabis ist ab heute legal!");
        System.out.println("Test!");
    }
}
