package Generics.AB_20_JavaGenerics_Uebungsaufgabe;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;
public class FigureContainer {
    private List<Figure> figures;
    public FigureContainer() {
        figures = new Vector<Figure>();
    }
    public void add (Figure f) {
        figures.add(f);
    }
    public Figure getFigure(int id) {
        for (Figure f : figures) {
            if (f.id == id) {
                return f;
            }
        }
        return null;
    }
    public boolean containsFig(int id) {
        for (Figure f : figures) {
            if (f.id == id) {
                return true;
            }
        }
        return false;
    }
    public Iterator<Figure> iterator() {
        return figures.iterator();
    }
    public int size() {
        return figures.size();
    }
    public void drawAll() {
        for (Figure f : figures) {
            f.draw();
        }
    }
}
