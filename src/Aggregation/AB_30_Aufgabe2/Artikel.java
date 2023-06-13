package Aggregation.AB_30_Aufgabe2;

public class Artikel {

    private String name;
    private int id;
    private String code;
    private int bestand;
    private double preis;

    public Artikel () {
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getCode () {
        return code;
    }

    public void setCode ( String code ) {
        this.code = code;
    }

    public int getBestand () {
        return bestand;
    }

    public void setBestand ( int bestand ) {
        this.bestand = bestand;
    }

    public double getPreis () {
        return preis;
    }

    public void setPreis ( double preis ) {
        this.preis = preis;
    }

    public void kaufen ( int anzahl ) {
        this.bestand += anzahl;
    }

}