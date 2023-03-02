package Vererbung.Kaffeemaschine;

/*
* soll den Zutaten-Bezeichner und die Methode zum Entnehmen von einer bestimmten Menge beinhalten
* */
public class ZutatenBehaelter extends Behaelter{
    public String name;
    public ZutatenBehaelter(String name) {
        this.name = name;
    }
    public void entnehmen(double menge) {
        this.fuellstand -= menge;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + " Max: " + this.fuellstand + " Füllstand: " + this.maxInhalt;
    }
}
