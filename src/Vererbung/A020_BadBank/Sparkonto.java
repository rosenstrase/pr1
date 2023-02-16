package Vererbung.A020_BadBank;

public class Sparkonto extends Bankkonto{
    private double zinssatz;
    public Sparkonto(double anfangsbestand, double zinssatz) {
        super(anfangsbestand);
        this.zinssatz = zinssatz;
    }
    public void zinsAnrechner() {
        this.einzahlen(kontoStand *(zinssatz/100));
    }
    @Override
    public void abheben(double betrag) {
        this.kontoStand -= betrag;
    }
    @Override
    public void einzahlen(double betrag) {
        this.kontoStand += betrag;
    }
}
