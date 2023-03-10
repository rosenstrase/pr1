package UE34_Interfaces_Aufgaben.Aufgabe1;

public interface NachrichtenQuelle {
    // Interessierte können sich bei der Quelle anmelden
    void anmelden ( NachrichtenEmpfaenger empf );
    // Angemeldete können sich bei der Quelle wieder abmelden
    void abmelden ( NachrichtenEmpfaenger empf );
    // neue Nachricht wird an alle angemeldeten Empfaenger uebergeben
    void sendeNachricht ( String nachricht );

}
