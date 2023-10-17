package Kapitel11;

public class Eichhoernchen extends Tier {
    public Eichhoernchen( float Gewicht_) {
        super(Gewicht_);
    }

    @Override
    protected String getName() {
        return "Eichhörnchen";
    }

    @Override
    protected boolean canEat(Tier other) {
        return false;
    }
}
