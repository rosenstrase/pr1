package X420_Lambda_Ausdruecke;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Person {
    public enum Sex {MALE, FEMALE, DIVERS}
    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAdress;

    public Person(String name, Person.Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        age = LocalDate.now().getYear() - birthday.getYear();
        if (birthday.getDayOfYear() >= LocalDate.now().getDayOfYear()) {
            age += 1;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public static void printPersonOlderThan(List<Person> roster, int age) {
        for (Person p:roster) {
            if (p.getAge()>= age) {
                p.printPerson();
            }
        }
    }
    private void printPerson() {
        System.out.println("Name" + this.getName());
    }
}
