package Kapitel11;

public class Baummarder extends Tier {
    public Baummarder(float initGewicht_, float Gewicht_,String Name_) {
        super(initGewicht_, Gewicht_, Name_);
    }



    @Override
    protected boolean canEat(Tier other) {
        return other instanceof Eichhoernchen & this.AnimalAlive() == other.AnimalAlive();
    }
}
