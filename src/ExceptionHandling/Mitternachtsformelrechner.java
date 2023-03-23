package ExceptionHandling;

public class Mitternachtsformelrechner {
    public static void main(String[] args) {
        System.out.println(berechneMitternachtsformel(1, 2, 3));
    }
    static double[] berechneMitternachtsformel(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException("a darf nicht 0 sein.");
        if (b * b - 4 * a * c < 0) throw new ArithmeticException("Die Wurzel darf nicht kleiner 0 sein.");

        double [] ergebnis = new double[2];
        double wurzel = Math.sqrt(b * b - 4 * a * c);
        ergebnis[0] = (-b + wurzel) / (2 * a);
        ergebnis[1] = (-b - wurzel) / (2 * a);
        return ergebnis;
    }
}

