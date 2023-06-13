package Aggregation.AB_30_Aufgabe2;

public class Verkaeufer {

    Artikel[] sortiment = new Artikel[100];

    public Verkaeufer ( Artikel[] sortiment ) {
        this.sortiment = sortiment;
    }

    public double getPreis ( int id ) {
        for ( Artikel artikel : sortiment ) {
            if ( artikel.getId() == id ) {
                return artikel.getPreis();
            }
        }

        return -1;
    }

    public void setPreis ( int id, double preis ) {
        for ( Artikel artikel : sortiment ) {
            if ( artikel.getId() == id ) {
                artikel.setPreis(preis);
            }
        }
    }

    public void kaufen ( int id, int anzahl ) {
        for ( Artikel artikel : sortiment ) {
            if ( artikel.getId() == id ) {
                artikel.kaufen(anzahl);
            }
        }
    }

    public void rabatt ( int minBestand, double rabatt ) {
        for ( Artikel artikel : sortiment ) {
            if ( artikel.getBestand() > minBestand ) {
                artikel.setPreis(artikel.getPreis() * ( 1 - rabatt ));
            }
        }
    }

    public void erweitereSortiment ( int anzahl ) {
        Artikel[] sortimentNeu = new Artikel[sortiment.length + anzahl];

        for ( int i = 0; i < sortiment.length; i++ ) {
            sortimentNeu[i] = sortiment[i];
        }

        sortiment = sortimentNeu;
    }

}