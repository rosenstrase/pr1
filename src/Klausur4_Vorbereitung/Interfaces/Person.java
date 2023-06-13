package Klausur4_Vorbereitung.Interfaces;

public class Person implements NachrichtenEmpfaenger{
    private String Vorname;
    private String Nachname;
    public Person(String vorname, String nachname) {
        Nachname = nachname;
        Vorname = vorname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    @Override
    public void empfangeNachricht(String nachricht) {
        System.out.println(Vorname + " " + Nachname + " empfängt Nachricht: " + nachricht);
    }
}
