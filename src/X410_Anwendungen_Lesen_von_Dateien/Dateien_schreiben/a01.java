package X410_Anwendungen_Lesen_von_Dateien.Dateien_schreiben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class a01 {
    public static void main(String[] args) throws IOException {

        // Definieren des Speicherorts für die Textdatei
        String speicherort = "C:\\Users\\Neil\\IdeaProjects\\pr1\\src\\X410_Anwendungen_Lesen_von_Dateien\\Dateien_schreiben\\a01_zahlen.txt";

        // FileWriter-Objekt zum Schreiben in die Datei
        FileWriter fw = null;

        // Tabulatorzeichen als String speichern
        String tz = "\t";

        // DecimalFormat zum Formatieren der Zahlen
        DecimalFormat df = new DecimalFormat("#");

        try {
            // Erstellen einer neuen Datei am angegebenen Speicherort
            File f = new File(speicherort);

            // FileWriter zum Schreiben in die Datei initialisieren
            fw = new FileWriter(speicherort);

            // Überschriften in die Datei schreiben
            fw.write("Geschwindigkeit [km/h]"  + tz + tz + "ca. Anhalteweg [m]" + "\n");
            fw.write("----------------------------------------------------" + "\n");

            // Schleife von 10 bis 100 mit Schrittweite 10
            for (int v = 10; v <= 100; v += 10) {

                // Berechnen des ungefähren Anhaltewegs (ahw) für jede Geschwindigkeit (v)
                double ahw = (v / 10) * (v / 10) + (v / 10) * 3;

                // Geschwindigkeit und Anhalteweg in die Datei schreiben
                fw.write(v + tz + tz + tz+ tz+ tz+ tz + tz+ tz+ tz+ df.format(ahw) + "\n");
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
