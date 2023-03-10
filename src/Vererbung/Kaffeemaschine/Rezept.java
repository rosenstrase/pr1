package Vererbung.Kaffeemaschine;

/*
soll den Namen des Getränks und die dafür notwendige Menge von Wasser, Kaffee, Kakao, Zucker und Milch in Liter beinhalten
*/
public class Rezept {
    protected String name;
    protected double wasserM;
    protected double kaffeeM;
    protected double kakaoM;
    protected double zuckerM;
    protected double milchM;
    public Rezept( String name, double wasserM, double kaffeeM, double kakaoM, double zuckerM, double milchM){
        this.name = name;
        this.wasserM = wasserM;
        this.kaffeeM = kaffeeM;
        this.kakaoM = kakaoM;
        this.zuckerM = zuckerM;
        this.milchM = milchM;
    }
    public void getInfo(){
        System.out.println(this.name + " " + this.wasserM + " " + this.kaffeeM + " " + this.kakaoM + " " + this.zuckerM + " " + this.milchM);
    }

    public static void getraenkerstellen(Rezept e) {
        Kaffemaschine.wasser.entnehmen(e.wasserM);
        Kaffemaschine.kaffee.entnehmen(e.kaffeeM);
        Kaffemaschine.kakao.entnehmen(e.kakaoM);
        Kaffemaschine.zucker.entnehmen(e.zuckerM);
        Kaffemaschine.milch.entnehmen(e.milchM);
    }

    public void getraenkerstellen() {
    }
}
