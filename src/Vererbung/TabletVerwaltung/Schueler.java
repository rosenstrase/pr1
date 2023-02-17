package Vererbung.TabletVerwaltung;

import java.util.ArrayList;

public class Schueler extends Person{
    private ArrayList meineTablets;
    private Tablet setSeinTablet;

    public static void main(String[] args) {
        Tablet seinTablet;
        ArrayList<Tablet> meineTablets;
        meineTablets = new ArrayList<Tablet>();
    }
    public Tablet getTablet() {
        Tablet SeinTablet = null;
        return SeinTablet;
    }
    public void setSeinTablet(Tablet pNeuesTablet) {
        this.meineTablets.add(pNeuesTablet);
        this.setSeinTablet = (Tablet) this.meineTablets.get(meineTablets.size()-1);
    }
}
