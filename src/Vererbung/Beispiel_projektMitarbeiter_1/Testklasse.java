package Vererbung.Beispiel_projektMitarbeiter_1;

public class Testklasse {
    public static void main(String[] args) {
        Mitarbeiter wa = new Mitarbeiter("Wellstein","Andreas", 1600.00);
        Mitarbeiter dit = new Mitarbeiter("Dietrich","Hans-Martin", 1650.00);
        Fuehrungskraft krp = new Fuehrungskraft("Krappel","Joachim",4000.00);
        Azubi sv = new Azubi("Vogel","Sven", 500);
        Hausmeister dw;
        dw = new Hausmeister();

        System.out.println(krp.position);
        System.out.println(krp.gehalt);
    }
}
