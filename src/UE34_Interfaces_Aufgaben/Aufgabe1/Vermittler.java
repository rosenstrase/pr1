package UE34_Interfaces_Aufgaben.Aufgabe1;

import java.util.Vector;

public class Vermittler implements NachrichtenEmpfaenger, NachrichtenQuelle{
    Vector MeineVermittlerObjs = new Vector <Vermittler>();
    @Override
    public void empfangeNachricht ( String nachricht ) {
        System.out.println("Vermittler empfaengt Nachricht und sendet sie weiter.");
        sendeNachricht(nachricht);
    }
    @Override
    public void anmelden ( NachrichtenEmpfaenger empf ) {
        MeineVermittlerObjs.add(empf);
    }
    @Override
    public void abmelden ( NachrichtenEmpfaenger empf ) {
        MeineVermittlerObjs.remove(empf);
    }
    @Override
    public void sendeNachricht ( String nachricht ) {
        // Gibt die Nachricht an alle angemeldeten Personen weiter

        for (int i = 0; i < MeineVermittlerObjs.size(); i++) {
            NachrichtenEmpfaenger ref = (NachrichtenEmpfaenger) MeineVermittlerObjs.elementAt(i);
            ref.empfangeNachricht(nachricht);
            System.out.println("Vermittler sendet Nachricht " + i + " an " + ref);
        }
    }
}
