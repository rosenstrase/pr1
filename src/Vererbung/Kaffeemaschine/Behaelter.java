package Vererbung.Kaffeemaschine;

/*
* 1. aktuellen Füllstand
* 2. maximalen Inhalt des Behälters in Liter
* */
abstract public class Behaelter {

    /*
     * abstrakte Methode die von den Subklassen überschrieben werden muss
     * */
    public double fuellstand;
    public double maxInhalt;

    @Override
    public String toString() {
        return "Behaelter{" + "fuellstand=" + fuellstand + ", maxInhalt=" + maxInhalt + '}';
    }
}


