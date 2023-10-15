package Kapitel13;

import Kapitel11.*;


public class Arena <T extends Tier, V extends Tier> {

    private final T animal1;
    private final V animal2;


    public Arena (T anml1,V anml2){
        animal1 = anml1;
        animal2 = anml2;
    }

    public void showdown() {
        //Schleife finden
        if (animal1)
        animal1.eat(animal2);
        System.out.println(animal1.getName());
    }

    public static void main(String[] args) {
        Eichhoernchen Eichhorn = new Eichhoernchen(1,1, "Eichhorn");
        Baummarder Baummard = new Baummarder(3,3,"Baummard");
        Arena<Tier,Tier> wg1 = new Arena<>(Eichhorn, Baummard);
        wg1.showdown();


    }
}


