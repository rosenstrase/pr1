package Generics.AB_20_JavaGenerics_Uebungsaufgabe;

public class Figure {
    public int id;
    public Figure(int id) {
        this.id = id;
    }
    public void draw() {
        System.out.println("Figure " + id + " is drawn");
    }
}
