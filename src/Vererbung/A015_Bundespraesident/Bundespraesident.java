package Vererbung.A015_Bundespraesident;

public class Bundespraesident extends Kunde {

    public Bundespraesident(String name, int rabattprozent) {
        super(name);

        System.out.println("Ich heiße " + name + " und erhalte überall " + rabattprozent + " Prozent Rabatt");
    }

    public static void main(String[] args) {
        Kunde k = new Bundespraesident("test", 4);
    }
}