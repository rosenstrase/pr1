package X410_Anwendungen_Lesen_von_Dateien.Dateien_schreiben;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class a02 {

    public static void main(String[] args) throws IOException {

        // Erstellen von ArrayLists für Celsius- und Kelvin-Werte
        ArrayList<Double> celsius = new ArrayList<Double>();
        ArrayList<Double> kelvin = new ArrayList<Double>();

        // Populieren der ArrayLists mit Celsius- und Kelvin-Werten
        for (int i = 0; i <= 100; i += 10) {
            celsius.add((double) i);
            kelvin.add((double) i + 273.15);
        }

        // Definieren des Speicherorts für die Textdatei
        String speicherort = "C:\\Users\\Neil\\IdeaProjects\\pr1\\src\\X410_Anwendungen_Lesen_von_Dateien\\Dateien_schreiben\\a02_gradcelsius.txt";

        // FileWriter-Objekt zum Schreiben in die Datei
        FileWriter fw = null;

        try {
            // FileWriter zum Schreiben in die Datei initialisieren
            fw = new FileWriter(speicherort);

            // Die Celsius- und Kelvin-Werte in die Datei schreiben
            for (int i = 0; i < celsius.size(); i++) {
                // Celsius-Wert und Tabulator schreiben
                fw.write(celsius.get(i) + "\t");
                // Kelvin-Wert und Zeilenumbruch schreiben
                fw.write(kelvin.get(i) + "\n");
            }

        } catch (Exception e) {
            // Fehlermeldung anzeigen, falls eine Exception auftritt
            System.out.println(e.getMessage());
        } finally {
            // FileWriter schließen, falls er geöffnet ist
            if (fw != null) {
                fw.close();
            }
        }

    }
}
