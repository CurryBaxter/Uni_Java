package Kapitel11;

public class Uhu extends Tier {
    public Uhu(float Gewicht_) {
        super(Gewicht_);
    }

    @Override
    protected String getName() {
        return "Uhu";
    }

    @Override
    protected boolean canEat(Tier other) {
        return other instanceof Eichhoernchen ^ other instanceof Baummarder & other.AnimalAlive() == this.AnimalAlive();
    }

}



