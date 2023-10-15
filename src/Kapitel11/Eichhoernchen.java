package Kapitel11;

public class Eichhoernchen extends Tier {
    public Eichhoernchen(float initGewicht_, float Gewicht_, String Name_) {
        super(initGewicht_, Gewicht_, Name_);
    }


    @Override
    protected boolean canEat(Tier other) {
        return false;
    }
}
