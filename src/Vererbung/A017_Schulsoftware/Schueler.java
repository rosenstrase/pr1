package Vererbung.A017_Schulsoftware;

public class Schueler extends Mensch{

    final static int jahresbeitragfaktor = 5;
    protected int stufe;

    public double jaehrlBetrag() {
        return (double) this.alter / this.stufe * jahresbeitragfaktor;
    }
}