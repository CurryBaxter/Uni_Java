package Kapitel9;


public class Auto {
    private double kilometerstand;
    private double tankfuellung;
    private double verbrauch;
    private double max_tankfuellung;
    private String nameFahrer;
    private int DriverAge;

    public void setDriver(String _name, int _age){
        nameFahrer = _name;
        if (_age>= 18){
            DriverAge = _age;

        }

    }


    public Auto (double _verbrauch,double _max_tankfuellung){
        verbrauch = _verbrauch;
        max_tankfuellung = _max_tankfuellung;
        kilometerstand = 0;
        tankfuellung = 0;
    }


         public double getVerbrauch(){
        return verbrauch;
        }
         public double getKilometerstand(){
         return kilometerstand;
         }
         public double getTankfuellung(){
         return tankfuellung;
        }
        public double getMax_tankfuellung(){
        return max_tankfuellung;
        }
        public int getDriverAge(){
        return DriverAge;
        }
        public String getNameFahrer(){
        return nameFahrer;
        }

        public double benzinKlauen(double liter){
            if (liter<= tankfuellung){
            tankfuellung -= liter;
            return liter;
            }
            return tankfuellung;
    }

    public double auftanken(float ltr){
        // maximale Tankfüllung 60 liter, wenn zugetankte liter + tankfüllung < 60 dann ist tankfüllung + liter neuer tankstand
        if (tankfuellung + ltr <= max_tankfuellung)
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
        Auto BMW = new Auto(6,60 );
        BMW.auftanken(60);
        BMW.setDriver("Felix", 18);
        System.out.println(BMW.getDriverAge());
        System.out.println(BMW.getNameFahrer());
        System.out.println(BMW.benzinKlauen(45));
        System.out.println(BMW.getTankfuellung());


    }
}
