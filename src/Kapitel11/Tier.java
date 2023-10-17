package Kapitel11;

public abstract class Tier {
    protected float gewicht;
    private float initGewicht;
    private boolean isAlive;

    public Tier (float Gewicht_){
        gewicht = Gewicht_;
        initGewicht = Gewicht_;
        isAlive = true;
    }


    public float getGewicht(){
        return this.gewicht;
    }


    public boolean AnimalAlive(){
        return this.isAlive;
    }

    public float getInitGewicht(){
        return this.initGewicht;
    }

    protected abstract String getName();



    protected abstract boolean canEat(Tier other);

    public void wirdGetoetet(){
        this.isAlive = false;
    }

    public void eat(Tier other){
        if (this.canEat((other))){
            this.gewicht += other.gewicht;
            other.wirdGetoetet();
        }
    }


    public void verdauen(){
        if (this.gewicht > this.initGewicht){
            this.gewicht -= (float) ((this.gewicht - this.initGewicht) * 0.95);
        }
    }


}
