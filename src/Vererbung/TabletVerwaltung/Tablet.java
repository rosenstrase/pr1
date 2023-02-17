package Vererbung.TabletVerwaltung;

import java.util.ArrayList;

public class Tablet {
    protected String modellbezeichnung;
    protected double groesse;

    public double getGroesse() {
        return groesse;
    }

    public String getModellbezeichnung() {
        return modellbezeichnung;
    }

    public void setModellbezeichnung(String modellbezeichnung) {
        this.modellbezeichnung = modellbezeichnung;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public Tablet(String modellbezeichnung, double groesse) {
        this.modellbezeichnung = modellbezeichnung;
        this.groesse = groesse;
    }
}
