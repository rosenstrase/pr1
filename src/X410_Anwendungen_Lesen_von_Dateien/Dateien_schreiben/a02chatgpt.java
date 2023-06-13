package X410_Anwendungen_Lesen_von_Dateien.Dateien_schreiben;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class a02chatgpt {

    public static void main(String[] args) throws IOException {

        // Erstellen von ArrayLists für Celsius- und Kelvin-Werte
        ArrayList<Double> celsius = new ArrayList<>();
        ArrayList<Double> kelvin = new ArrayList<>();

        // Definieren des Dateinamens und Speicherorts der Eingabedatei
        String eingabeDatei = "C:\\Users\\Neil\\IdeaProjects\\pr1\\src\\X410_Anwendungen_Lesen_von_Dateien\\Dateien_schreiben\\a02_gradcelsius.txt";

        // FileReader-Objekt zum Lesen der Eingabedatei
        FileReader fr = null;
        BufferedReader br = null;

        // Definieren des Dateinamens und Speicherorts der Ausgabedatei
        String ausgabeDatei = "C:\\Users\\Neil\\IdeaProjects\\pr1\\src\\X410_Anwendungen_Lesen_von_Dateien\\Dateien_schreiben\\a02_kelvin.txt";

        // FileWriter-Objekt zum Schreiben in die Ausgabedatei
        FileWriter fw = null;

        try {
            // FileReader zum Lesen der Eingabedatei initialisieren
            fr = new FileReader(eingabeDatei);
            br = new BufferedReader(fr);

            String line;
            // Zeilenweise Lesen der Eingabedatei
            while ((line = br.readLine()) != null) {
                // Die gelesene Zeile in Celsius-Wert und Kelvin-Wert aufteilen
                String[] parts = line.split(";");
                double celsiusValue = Double.parseDouble(parts[0]);

                // Celsius-Wert zur ArrayList hinzufügen
                celsius.add(celsiusValue);
                // Kelvin-Wert zur ArrayList hinzufügen (Celsius + 273.15)
                kelvin.add(celsiusValue + 273.15);
            }

            // FileWriter zum Schreiben in die Ausgabedatei initialisieren
            fw = new FileWriter(ausgabeDatei);

            // Die Celsius- und Kelvin-Werte in die Ausgabedatei schreiben
            for (int i = 0; i < celsius.size(); i++) {
                // Formatierter Text in der Form "Celsius;Kelvin\n" in die Ausgabedatei schreiben
                fw.write(String.format("%.2f ; %.2f%n", celsius.get(i), kelvin.get(i)));
            }

        } catch (Exception e) {
            // Fehlermeldung anzeigen, falls eine Exception auftritt
            System.out.println(e.getMessage());
        } finally {
            // FileReader und BufferedReader schließen, falls sie geöffnet sind
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
            // FileWriter schließen, falls er geöffnet ist
            if (fw != null) {
                fw.close();
            }
        }
    }
}
