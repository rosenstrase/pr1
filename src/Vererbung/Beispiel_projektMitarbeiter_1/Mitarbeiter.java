package Vererbung.Beispiel_projektMitarbeiter_1;

public class Mitarbeiter{

    private String name;
    private String vorname;
    public double gehalt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public Mitarbeiter(String name, String vorname, double gehalt) {
        this.name = name;
        this.vorname = vorname;
        this.gehalt = gehalt;
    }
    public Mitarbeiter() {    }
}