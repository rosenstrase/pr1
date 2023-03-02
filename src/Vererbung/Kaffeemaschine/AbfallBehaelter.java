package Vererbung.Kaffeemaschine;

/*
* Nach dem Zubereiten von Kaffee soll so viel Kaffeesatz in diesem Behälter gesammelt werden,
* wie Kaffee verbraucht wurde.
* Methode zum Nachfüllen implementieren.
* */
public class AbfallBehaelter extends Behaelter{
    @Override
    public String toString() {
        return "AbfallBehaelter{}" + this.fuellstand;
    }
    public void fuell(double kaffeeA){
        this.fuellstand += kaffeeA;
    }
}
