package Kapitel11;

public class Eichhoernchen extends Tier {
    public Eichhoernchen(float initGewicht_, float Gewicht_) {
        super(initGewicht_, Gewicht_);
    }

    @Override
    protected boolean canEat(Tier other) {
        return false;
    }
}
