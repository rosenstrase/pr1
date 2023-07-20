package X420_Lambda_Ausdruecke;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<Person> personliste = new ArrayList<Person>();
        int vergleichsAlter = 40;

        Person p1 = new Person("Tip", Person.Sex.DIVERS);
        personliste.add(p1);
        Person p2 = new Person("Trick", Person.Sex.MALE);
        personliste.add(p2);
        Person p3 = new Person("Daisy", Person.Sex.FEMALE);
        personliste.add(p3);

        p1.setAge(11);
        p2.setAge(12);
        p3.setAge(52);

        Person.printPersonOlderThan(personliste, vergleichsAlter);
    }
}
