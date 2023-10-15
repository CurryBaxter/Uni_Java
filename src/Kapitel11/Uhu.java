package Kapitel11;

public class Uhu extends Tier {
    public Uhu(float initGewicht_, float Gewicht_, String Name_) {
        super(initGewicht_, Gewicht_, Name_);
    }

    @Override
    protected boolean canEat(Tier other) {
        return other instanceof Eichhoernchen ^ other instanceof Baummarder & other.AnimalAlive() == this.AnimalAlive();
    }

}



