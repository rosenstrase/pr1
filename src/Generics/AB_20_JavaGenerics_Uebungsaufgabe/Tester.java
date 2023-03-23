package Generics.AB_20_JavaGenerics_Uebungsaufgabe;
import java.util.Iterator;
public class Tester {
    public static void main ( String[] args ) {
        FigureContainer fc = new FigureContainer();
        for ( int i = 1; i <= 100; i++ ) {
            if ( i % 3 == 0 ) {
                fc.add(new Circle(i));
            } else if ( i % 3 == 1 ) {
                fc.add(new Triangle(i));
            } else {
                fc.add(new Square(i));
            }
        }
        System.out.println("Anzahl der Elemente: " + fc.size());
        System.out.println("Enthält id 42? " + fc.containsFig(42));
        System.out.println("-- Objekt 42: " + fc.getFigure(42));
        System.out.println("Enthält id 8015? " + fc.containsFig(8015));
        System.out.println("-- Objekt 42: " + fc.getFigure(8015));
        int count = 0;
        Iterator<Figure> itr = fc.iterator();
        while ( itr.hasNext() ) {
            itr.next();
            count++;
        }
        System.out.println("Anzahl der Elemente: " + count);
        fc.drawAll();
    }
}
