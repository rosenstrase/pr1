package Vererbung.A020_BadBank;

public class Girokonto extends Bankkonto{
    private double gebuehr;
    public Girokonto(double kontostand, double gebuehr) {
        super(kontostand);
        this.gebuehr = gebuehr;
    }
    @Override
    public void einzahlen(double x) {
        this.kontoStand += x - this.gebuehr;
    }
    @Override
    public void abheben(double x) {
        this.kontoStand -= x - this.gebuehr;
    }
}