package Vererbung.Kaffeemaschine;

/*
soll den Namen des Getränks und die dafür notwendige Menge von Wasser, Kaffee, Kakao, Zucker und Milch in Liter beinhalten
*/
public class Rezept {
    String name;
    double wasserM;
    double kaffeeM;
    double kakaoM;
    double zuckerM;
    double milchM;
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

    public void machen() {
        Kaffemaschine.wasser.entnehmen(wasserM);
        Kaffemaschine.kaffee.entnehmen(kaffeeM);
        Kaffemaschine.kakao.entnehmen(kakaoM);
        Kaffemaschine.zucker.entnehmen(zuckerM);
        Kaffemaschine.milch.entnehmen(milchM);
        Kaffemaschine.abfall.fuell(kaffeeM);
    }
}
