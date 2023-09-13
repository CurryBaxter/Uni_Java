package Kapitel9;

public class Tankstelle {
    private double PreisProLiter;


    public Tankstelle(double _PreisProLiter) {
        PreisProLiter = _PreisProLiter;
    }
    public double getPreisProLiter(){
        return PreisProLiter;
    }
    public void setPreisProLiter(double Preis){

        if (Preis >= 0.5 ^ Preis <= 2.5){
            PreisProLiter = Preis;
        }
    }

    public void autoAuftanken(Auto a, double Menge){
        if ( Menge + a.getTankfuellung() > a.getMax_tankfuellung()){
            double getankteLiter = a.getMax_tankfuellung() - a.getTankfuellung();
            a.auftanken(Menge);
            System.out.println("Der Preis für das Auftanken beträgt: " + getankteLiter * PreisProLiter);
            return;

        }
        else{
            a.auftanken(Menge);
            System.out.println("Der Preis für das Auftanken beträgt: " + Menge * PreisProLiter + "€");
            return;
        }

    }

}


