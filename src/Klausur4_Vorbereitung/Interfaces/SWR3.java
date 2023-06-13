package Klausur4_Vorbereitung.Interfaces;

import java.util.Vector;

public class SWR3 implements NachrichtenQuelle {
    private String typ;
    Vector vector = new Vector<Person>();
    public SWR3(String typ) {
        this.typ = typ;
    }

    @Override
    public void anmelden(NachrichtenEmpfaenger empf) {
        vector.add(empf);
    }

    @Override
    public void abmelden(NachrichtenEmpfaenger empf) {
        vector.remove(empf);
    }

    @Override
    public void sendeNachricht(String nachricht) {
        for (int i = 0; i < vector.size(); i++) {
            NachrichtenEmpfaenger reference = (NachrichtenEmpfaenger) vector.elementAt(i);
            reference.empfangeNachricht(nachricht);
        }
    }
}
