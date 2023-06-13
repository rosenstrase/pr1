package Klausur4_Vorbereitung.Generics;

import java.util.Iterator;
import java.util.Vector;
import java.util.List;

public class FigureContainer {
    //Die Klasse verwendet Generics, um sicherzustellen, dass nur Figure-Objekte in der Sammlung gespeichert werden können. Die figures-Instanzvariable ist eine Liste von Figure-Objekten.
    private List<Figure> figures;

    //Der Konstruktor der Klasse initialisiert die figures-Instanzvariable als eine neue Instanz von Vector<Figure>(). Vector ist eine synchronisierte Liste in Java, die verwendet wird, um eine Sammlung von Objekten zu speichern.
    public FigureContainer() {
        this.figures = new Vector<Figure>();
    }

    //Die add-Methode fügt ein Figure-Objekt zur Sammlung hinzu.
    public void add(Figure figure) {
        this.figures.add(figure);
    }

    //Die getFigure-Methode sucht ein Figure-Objekt in der Sammlung nach der übergebenen id und gibt es zurück, falls es gefunden wird. Wenn kein Objekt mit der gegebenen id gefunden wird, gibt die Methode null zurück.
    public Figure getFigure(int id) {
        for (Figure figure : this.figures) {
            if (figure.id == id) {
                return figure;
            }
        } return null;
    }

    //Die contains-Methode prüft, ob ein Figure-Objekt mit der gegebenen id in der Sammlung vorhanden ist, indem sie die getFigure-Methode verwendet.
    public boolean containsFig(int id) {
        return this.getFigure(id) != null;
    }

    //Die iterator-Methode gibt einen Iterator zurück, der es ermöglicht, über die Figure-Objekte in der Sammlung zu iterieren.
    public Iterator<Figure> iterator() {
        return this.figures.iterator();
    }

    //Die size-Methode gibt die Anzahl der Figure-Objekte in der Sammlung zurück.
    public int size() {
        return this.figures.size();
    }

    //Die drawAll-Methode ruft die draw-Methode für jedes Figure-Objekt in der Sammlung auf, wodurch jedes Objekt gezeichnet wird.
    public void drawAll() {
        for (Figure figure: this.figures) {
            figure.draw();
        }
    }
}
