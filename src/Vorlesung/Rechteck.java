package Vorlesung;

public class Rechteck {
    private Punkt punkt;
    private int breite;
    private int hoehe;


    public Rechteck (Punkt punkt, int breite, int hoehe ){
        this.punkt = punkt;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public int berechneFlaeche (){
        return breite * hoehe;
    }

    public Punkt getPunkt() {
        return punkt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj instanceof Rechteck rechteck){
            return this.hoehe == rechteck.hoehe && this.breite == rechteck.breite && this.punkt == rechteck.punkt ;
        }
        return false;
    }


    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2,4);
        Rechteck rechteck1 = new Rechteck(punkt1,41,10);
        Rechteck rechteck2 = new Rechteck(punkt1,40, 10);
        System.out.println(rechteck1.equals(rechteck2));
    }
}
