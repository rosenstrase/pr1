package Vererbung.A016_Rabatt;

public class RechnungRabatt extends Rechnung {
    private double rabatt;
    public RechnungRabatt(double gesamtbetrag, double mehrwertssteuer, double rabatt) {
        super(gesamtbetrag, mehrwertssteuer);
        this.rabatt = rabatt;
    }
    @Override
    protected double bruttobetragRechner() {
        return super.bruttobetragRechner() * (1 + rabatt);
    }
}