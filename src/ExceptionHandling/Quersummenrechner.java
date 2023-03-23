package ExceptionHandling;

import java.util.Scanner;

public class Quersummenrechner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int eingabe = sc.nextInt();
            int quersumme = berechneQuersumme(eingabe);
            System.out.println("Die Quersumme ist: " + quersumme);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
    static int berechneQuersumme(int x) throws Exception {
        if (x < 0) throw new Exception("Die Zahl muss größer sein als 0");
        int quersumme = 0;
        while (x > 0) {
            quersumme += x % 10;
            x /= 10;
        }
        return quersumme;
    }
}
