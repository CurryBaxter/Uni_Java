package Kapitel13;

import Kapitel11.*;


public class Arena <T extends Tier, V extends Tier> {


    public Tier showdown (T anml1,V anml2) {
    anml1.eat(anml2);
    anml2.eat(anml1);


    if (!anml1.AnimalAlive()){
        return anml2;
    }
    if (!anml2.AnimalAlive()){
        return anml1;
    }

    return null;
    }

    public static void main(String[] args) {
        Arena<Uhu,Baummarder> arena = new Arena<>();
        Uhu uhi = new Uhu(3);
        Baummarder baumi = new Baummarder(1);

        Tier sieger = arena.showdown(uhi,baumi);

        if (sieger != null){
            System.out.println("Sieger Duell 1: " + sieger.getClass());
        }
        else{
            System.out.println("Es gibt keinen Sieger in Duell 1");
        }
            Arena<Uhu,Uhu> arena2 = new Arena<>();
        Uhu uhi2 = new Uhu(2);
        Tier sieger2 = arena2.showdown(uhi, uhi2);

        if (sieger2 != null){
            System.out.println("Sieger Duell 2: " + sieger2.getClass());
        }
        else{
            System.out.println("Es gibt keinen Sieger bei Duell 2");
        }
    }
}


