package Vererbung.ImmoGmbH;

public class Wohnhaus extends Wohnung{
    public int grundfl;

    public int getGrundfl() {
        return grundfl;
    }

    public void setGrundfl(int grundfl) {
        this.grundfl = grundfl;
    }

    public Wohnhaus(String ort, String bjahr, int wohnfl, int preis, int grundfl) {
        super(ort, bjahr, wohnfl, preis);
        this.grundfl = grundfl;
    }
}
