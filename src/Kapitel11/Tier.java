package Kapitel11;

public abstract class Tier {
    protected float gewicht;
    private float initGewicht;
    private boolean isAlive;
    private String name;

    public Tier (float initGewicht_, float Gewicht_, String Name_){
        gewicht = Gewicht_;
        initGewicht = initGewicht_;
        isAlive = true;
        this.name = Name_;
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

    public String getName(){
        return this.name;
    }



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
