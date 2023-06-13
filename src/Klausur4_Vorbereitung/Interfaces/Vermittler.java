package Klausur4_Vorbereitung.Interfaces;

import java.util.Vector;

public class Vermittler implements NachrichtenEmpfaenger, NachrichtenQuelle{

    Vector MeineVermittlerObjects = new Vector<Vermittler>();

    @Override
    public void empfangeNachricht(String nachricht) {
        System.out.println("Vermittler empfängt Nachricht und sendet sie weiter!");
        sendeNachricht(nachricht);
    }

    @Override
    public void anmelden(NachrichtenEmpfaenger empf) {
        //Fügt alle Empfänger in den Vector ein
        MeineVermittlerObjects.add(empf);
    }

    @Override
    public void abmelden(NachrichtenEmpfaenger empf) {
        //Entfernt alle Nichtempfänger wieder aus dem Vector
        MeineVermittlerObjects.remove(empf);
    }

    @Override
    public void sendeNachricht(String nachricht) {
        for (int i = 0; i < MeineVermittlerObjects.size(); i++) {
            NachrichtenEmpfaenger reference = (NachrichtenEmpfaenger) MeineVermittlerObjects.elementAt(i);
            reference.empfangeNachricht(nachricht);
            System.out.println("Vermittler sendet Nachricht: " + i + " an " + reference + ".");
        }
    }
}
