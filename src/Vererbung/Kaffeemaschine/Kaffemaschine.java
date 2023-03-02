package Vererbung.Kaffeemaschine;


import java.util.ArrayList;
import java.util.Scanner;

/*
* gibt in einer endlosen Schleife eine nummerierte Liste der angebotenen Getränke (bzw. vorhandenen Rezepte) aus,
* von denen der Benutzer eines auswählen kann
* */
public class Kaffemaschine {
    static ZutatenBehaelter wasser = new ZutatenBehaelter("Wasser");
    static ZutatenBehaelter kaffee = new ZutatenBehaelter("Kaffee");
    static ZutatenBehaelter kakao = new ZutatenBehaelter("Kakao");
    static ZutatenBehaelter zucker = new ZutatenBehaelter("Zucker");
    static ZutatenBehaelter milch = new ZutatenBehaelter("Milch");
    static AbfallBehaelter abfall = new AbfallBehaelter();
    public static void main(String[] args) {
        ArrayList<Rezept> RezeptL = new ArrayList<Rezept>();
        RezeptL.add(new Rezept("Kaffe Schwarz", 0.2, 0.02, 0.0, 0.0, 0.0));
        RezeptL.add(new Rezept("Kaffe Zucker", 0.2, 0.02, 0.0, 0.02, 0.0));
        RezeptL.add(new Rezept("Kaffe Milch", 0.2, 0.02, 0.0, 0.0, 0.02));
        RezeptL.add(new Rezept("Kaffe Milch/Zucker", 0.2, 0.02, 0.0, 0.02, 0.02));
        RezeptL.add(new Rezept("Kakao", 0.2, 0.0, 0.02, 0.02, 0.02));
        Scanner sc = new Scanner(System.in);
        for (;;){
            RezeptL.forEach((n) -> n.getInfo());
            System.out.println("Was für einen Kaffee wollen Sie?");
            RezeptL.get(sc.nextInt()).machen();
        }
    }
}
