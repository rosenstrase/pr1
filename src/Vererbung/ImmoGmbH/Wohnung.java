package Vererbung.ImmoGmbH;

public class Wohnung {
    public int preis;
    public String bjahr;
    public int wohnfl;
    public String ort;

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getBjahr() {
        return bjahr;
    }

    public void setBjahr(String bjahr) {
        this.bjahr = bjahr;
    }

    public int getWohnfl() {
        return wohnfl;
    }

    public void setWohnfl(int wohnfl) {
        this.wohnfl = wohnfl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Wohnung(String ort, String bjahr, int wohnfl, int preis){
        this.ort = ort;
        this.bjahr = bjahr;
        this.wohnfl = wohnfl;
        this.preis = preis;
    }

}
