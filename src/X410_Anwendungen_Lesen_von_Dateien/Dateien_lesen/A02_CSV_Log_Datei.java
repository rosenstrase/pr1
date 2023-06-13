package X410_Anwendungen_Lesen_von_Dateien.Dateien_lesen;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class A02_CSV_Log_Datei {
    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<String>();

        try {

            FileInputStream myFileReader = new FileInputStream("src/X410_Anwendungen_Lesen_von_Dateien/log.csv");

            InputStreamReader myReader = new InputStreamReader(myFileReader, StandardCharsets.UTF_8);

            int read;
            StringBuilder currentName = new StringBuilder();

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        } catch (java.io.IOException e) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }
}
