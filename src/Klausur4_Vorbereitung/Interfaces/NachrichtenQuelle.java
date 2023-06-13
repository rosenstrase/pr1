package Klausur4_Vorbereitung.Interfaces;

interface NachrichtenQuelle {
    public void anmelden(NachrichtenEmpfaenger empf);
    public void abmelden(NachrichtenEmpfaenger empf);
    public void sendeNachricht(String nachricht);
}
