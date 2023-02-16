package Vererbung.A020_BadBank;

public abstract class Bankkonto {
    protected double kontoStand;
    /***
     *
     * @param anfangsbetrag
     */
    public Bankkonto(double anfangsbetrag) {
        this.kontoStand = anfangsbetrag;
    }
    public double getKontoStand() {
        return kontoStand;
    }
    public abstract void einzahlen(double x);
    public abstract void abheben(double x);
}
