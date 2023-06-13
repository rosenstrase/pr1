package Klausur4_Vorbereitung.Exceptions;

import java.util.Scanner;

public class Wurzelrechner {
    public static void main(String[] args) {
        try {
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Geben Sie eine Zahl eine positive Zahl ein: ");
            double zahl = eingabe.nextDouble();
            System.out.println(Wurzelrechner.berechneWurzel(zahl));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static double berechneWurzel(double zahl) {
        if (zahl < 0) {
            throw new ArithmeticException("Zahl < 0: Die Wurzel ist für negative Zahlen nicht definiert!");
        }
        return Math.sqrt(zahl);
    }
}
