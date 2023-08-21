package Kapitel4;

public class Auto {
    private double kilometerstand;
    private double tankfuellung;
    private double verbrauch;

    public Auto (double _verbrauch){
        verbrauch = _verbrauch;
        kilometerstand = 0;
        tankfuellung = 0;
    }

    /*
         public double getVerbrauch(){
        return verbrauch;
        }
         public double getKilometerstand(){
         return kilometerstand;
         }
         public double getTankfuellung(){
         return tankfuellung;
        }
        */

    public double auftanken(float ltr){
        // maximale Tankfüllung 60 liter, wenn zugetankte liter + tankfüllung < 60 dann ist tankfüllung + liter neuer tankstand
        if (tankfuellung + ltr < 60)
            tankfuellung = tankfuellung + ltr;
        // zugetankte Liter + tankfüllung > 60 dann wird gekappt
        else{
            tankfuellung = 60;
        }
        System.out.println("Neuer Füllstand des Tankes nach auftanken: "+ tankfuellung + " Liter" );
        // return von aufgetankte Liter an float
        return tankfuellung - ltr;



    }

    public void fahren(double strecke){
        if (verbrauch <= 0){
            return;
        }
        double VerbrauchFuerStrecke = strecke * verbrauch / 100.0;
        double zurueckgelegteStrecke = 0;
        //reicht vorhandene Tankfüllung für Strecke?
        if (VerbrauchFuerStrecke <= tankfuellung ){
            // wenn ja, neuer kilometerstand = alter kilometerstand + strecke
            zurueckgelegteStrecke = strecke;
            kilometerstand = kilometerstand + zurueckgelegteStrecke;
            tankfuellung = tankfuellung - VerbrauchFuerStrecke;
        }

        else {
          zurueckgelegteStrecke = (tankfuellung/verbrauch) * 100.0;
          kilometerstand = kilometerstand + zurueckgelegteStrecke;
          tankfuellung = 0;
        }
        System.out.println("Tatsächlich zurückgelegte Kilometer: " + zurueckgelegteStrecke + " Km");
        System.out.println("Neuer kilometerstand: " + kilometerstand + " Km");
        System.out.println("Neuer Tankstand: " + tankfuellung + " ltr");
    }


    public static void main(String[] args) {
       Auto BMW = new Auto(6);
       BMW.auftanken(60);

       BMW.fahren(200);
       BMW.fahren(300);
       BMW.fahren(400);
       BMW.fahren(200);
    }
}
