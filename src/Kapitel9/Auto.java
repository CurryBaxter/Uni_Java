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

    public boolean equals(Object other){
        if (other instanceof Auto otherAuto){
            return otherAuto.getKilometerstand() == this.getKilometerstand() && otherAuto.getMax_tankfuellung() == this.getMax_tankfuellung() && otherAuto.getVerbrauch() == this.getVerbrauch() && otherAuto.getTankfuellung() == this.getTankfuellung();

        }
        return false;
    }

    public static void autosAngleichen(Auto auto1, Auto auto2, Tankstelle T1){
        if (auto1 != null && auto2 != null){
            auto2.setDriver(auto1.nameFahrer, auto1.DriverAge );

            if (auto1.tankfuellung > auto2.tankfuellung){
                T1.autoAuftanken(auto2,auto1.tankfuellung-auto2.tankfuellung);
                return;
            }
            else if (auto2.tankfuellung > auto1.tankfuellung) {
                T1.autoAuftanken(auto1, auto2.tankfuellung- auto1.tankfuellung);
                return;

            } else{
                return;

            }
        }
        else{
            return;
        }

    }


    public double auftanken(double ltr){
        // maximale Tankfüllung 60 liter, wenn zugetankte liter + tankfüllung < 60 dann ist tankfüllung + liter neuer tankstand
        if (tankfuellung + ltr <= max_tankfuellung)
            tankfuellung += ltr;
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
        Tankstelle HEM = new Tankstelle(2);
        HEM.autoAuftanken(BMW, 40);
        BMW.setDriver("Martin", 18);
        //BMW.benzinKlauen(45);
        //System.out.println(BMW.getTankfuellung());
        //HEM.autoAuftanken(BMW,45);
        //BMW.fahren(600);
        //HEM.autoAuftanken(BMW, 45);
        Auto VW = new Auto(6, 60);
        HEM.autoAuftanken(VW, 55);
        System.out.println(BMW.getTankfuellung());
        //Auto VW = null;
        autosAngleichen(BMW,VW,HEM);
        System.out.println(BMW.getTankfuellung());
        //System.out.println(VW.getNameFahrer());
        System.out.println(VW.equals(BMW));




    }
}
