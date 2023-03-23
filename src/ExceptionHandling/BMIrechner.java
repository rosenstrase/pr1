package ExceptionHandling;

import java.util.Scanner;

public class BMIrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Geben Sie Ihr Körpergewicht mit Nachkommastelle ein.");
            double gewicht = sc.nextDouble();
            System.out.println("Geben Sie Ihre Körpergröße mit Nachkommastelle ein.");
            double groesse = sc.nextDouble();
            System.out.println(berechneBMI(gewicht, groesse));
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
    static double berechneBMI(double gewicht, double groesse) throws Exception{
        if (groesse <= 0 || groesse > 3.0) throw new IllegalArgumentException("Die Körpergröße ist nicht möglich.");
        if (gewicht <= 0 || gewicht > 1000.0) throw new Exception("Das Körpergewicht ist nicht möglich.");
        return gewicht / (groesse * groesse);
    }
}
