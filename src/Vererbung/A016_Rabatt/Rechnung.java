package Vererbung.A016_Rabatt;

public class Rechnung {
    protected double gesamtbetrag;
    protected double mehrwertssteuer;

    public Rechnung(double gesamtbetrag, double mehrwertssteuer) {
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertssteuer = mehrwertssteuer;
    }
    protected double bruttobetragRechner() {

        return  this.gesamtbetrag + this.gesamtbetrag * this.mehrwertssteuer;
    }
}