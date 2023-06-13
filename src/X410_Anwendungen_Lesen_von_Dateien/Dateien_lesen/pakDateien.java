package X410_Anwendungen_Lesen_von_Dateien.Dateien_lesen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class pakDateien {

    static String filename = "C:\\Users\\Neil\\Desktop\\ADV\\PR1 Wellstein\\Demo_together-20230525\\daten.txt";
    public static void main(String[] args) {
        BufferedReader reader = null;
        String [] datenarray = null;
        String trennzeichen = "\t";
        String line, ersteZeile = "", zweiteZeile = "";
        double zahl = 0.0, quadratzahl = 0.0, wurzelzahl = 0.0;
        double ergebniszahl = 0.0, ergebnisquadrat = 0.0, ergebniswurzel = 0.0;

        try {
            reader = Files.newBufferedReader(Path.of(filename));

            ersteZeile = reader.readLine();
            System.out.println(ersteZeile);
            zweiteZeile = reader.readLine();
            System.out.println(zweiteZeile);

            while ((line = reader.readLine()) != null)
                {
                System.out.println(line);
                datenarray = line.split(trennzeichen);
                quadratzahl = Double.parseDouble(datenarray[1]);
                wurzelzahl = Double.parseDouble(datenarray[2].replace("," , "."));

                ergebniszahl = ergebniszahl + zahl;
                ergebnisquadrat = ergebnisquadrat + quadratzahl;
                ergebniswurzel = ergebniswurzel + wurzelzahl;
                }

            System.out.println(zweiteZeile);
            System.out.println(ergebniszahl + trennzeichen + ergebnisquadrat + trennzeichen + ergebniswurzel);

        } catch (NoSuchFileException nsfe) {
            System.out.println("Fehler: " + nsfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Fehler: " + ioe.getMessage());
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
                }
        }
    }
}
