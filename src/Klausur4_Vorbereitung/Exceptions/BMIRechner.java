package Klausur4_Vorbereitung.Exceptions;

import java.util.Scanner;

public class BMIRechner {
    public static void main(String[] args) {
        try {
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Was ist ihr Körpergewicht in kg?");
            double koerpergewicht = eingabe.nextDouble();
            System.out.println("Was ist ihre Körpergröße in m?");
            double koerpergroesse = eingabe.nextDouble();
            eingabe.close();
            System.out.println(berechneBMI(koerpergewicht, koerpergroesse));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Es ist ein Fehler aufgetreten.");
        } finally {
            System.out.println("Danke für Ihre Nutzung des BMI Rechners!");
        }

    }
    static double berechneBMI(double koerpergewicht, double koerpergroesse) {
        if (koerpergewicht < 0 || koerpergewicht > 1000) {
            throw new IllegalArgumentException("Das Körpergewicht ist nicht möglich!");
        }
        if (koerpergroesse < 0.0 || koerpergroesse > 3.0) {
            throw new IllegalArgumentException("Die Körpergröße ist nicht möglich!");
        }
        return(koerpergewicht/(koerpergroesse*koerpergroesse));
    }
}
