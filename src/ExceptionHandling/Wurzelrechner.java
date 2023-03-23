package ExceptionHandling;

public class Wurzelrechner{
    public static void main(String[] args) {
        try {
            double wurzel = berechneWurzel(-1);
            System.out.println("Die Wurzel ist: " + wurzel);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
    static double berechneWurzel(double x) throws Exception {
        if (x < 0) throw new Exception("Die Zahl muss größer sein als 0");
        return Math.sqrt(x);
    }

}
