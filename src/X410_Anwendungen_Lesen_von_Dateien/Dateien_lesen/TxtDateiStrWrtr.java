package X410_Anwendungen_Lesen_von_Dateien.Dateien_lesen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TxtDateiStrWrtr {
    public static void main(String[] args) {
        String dateiname = "C:\\tmp\\DebugWa.info";
        String text = "OS Build : 18362.720";
        try {
            Files.writeString(Path.of(dateiname),text);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
