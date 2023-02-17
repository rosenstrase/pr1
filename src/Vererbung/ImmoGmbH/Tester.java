package Vererbung.ImmoGmbH;

public class Tester {
    public static void main(String[] args) {
        Wohnung a = new Wohnung("Ulm", "2005", 85, 185000);
        Wohnhaus b = new Wohnhaus("Esslingen", "1996", 180, 575000, 450);
        System.out.println("****Objekt 1****"+"\nLocation: "+a.getOrt()+"\nBaujahr: "+a.getBjahr()+"\nWohnfläche: "+a.getWohnfl()+"\nPreis: "+a.getPreis());
        System.out.println("****Objekt 2****"+"\nLocation: "+b.getOrt()+"\nBaujahr: "+b.getBjahr()+"\nWohnfläche: "+b.getWohnfl()+"\nPreis: "+b.getPreis()+"\nGrundstücksfläche: "+b.getGrundfl());
    }
}
