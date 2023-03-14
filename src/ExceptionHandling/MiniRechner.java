package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MiniRechner {
    public static void main(String[] args) {
        //Deklaration
        try {
            int zaehler, nenner, divison;

            Scanner sc = new Scanner(System.in);
            System.out.println("Division zweier int-Zahlen");
            System.out.println("**********************");
            System.out.println("Bitte geben Sie den Zähler ein: ");
            zaehler = sc.nextInt();
            System.out.println("Bitte geben Sie den Nenner ein: ");
            nenner = sc.nextInt();
            divison = zaehler / nenner;
            System.out.println("Ergebnis aus  " + zaehler + " / " + nenner + " = " + divison);
            sc.close();

        } catch (InputMismatchException ex) {
            System.out.println("********************im catch 1************");
            String name = ex.getClass().getName();

            System.out.println("Name:" + name);

        } catch (ArithmeticException ey) {
            System.out.println("********************im catch 2************");
            String msg = ey.getMessage();
            System.out.println("Message:" + msg);

        } catch (Exception e) {
            System.out.println("********************im catch *************");
            e.printStackTrace(); //Die Mindestausgabe
        }
        finally {

        }
    }
}