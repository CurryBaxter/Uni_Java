package Kapitel11;

public class Baummarder extends Tier {
    public Baummarder(float Gewicht_) {
        super(Gewicht_);
    }

    @Override
    protected String getName() {
        return "Baummarder";
    }

    @Override
    protected boolean canEat(Tier other) {
        return other instanceof Eichhoernchen & this.AnimalAlive() == other.AnimalAlive();
    }
}
