package Klausur4_Vorbereitung.Generics;

public class Figure {
    int id;

    public Figure(int id) {
        this.id = id;
    }

    public void draw() {
        System.out.println("Figure.draw() mit id = " + this.id);
    }
}
