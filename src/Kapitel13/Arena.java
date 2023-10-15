package Kapitel13;

import Kapitel11.*;

import javax.swing.plaf.basic.BasicIconFactory;

public class Arena <T extends Tier, V extends Tier> {

    private final T animal1;
    private final V animal2;


    public Arena (T anml1,V anml2){
        animal1 = anml1;
        animal2 = anml2;
    }

    public void showdown() {
        animal1.eat(animal2);
        // Richtiger Output gesucht
        System.out.println(animal1.getClass());
    }

    public static void main(String[] args) {
        Eichhoernchen Eichhorn = new Eichhoernchen(1,1);
        Baummarder Baummard = new Baummarder(3,3);
        Arena<Tier,Tier> wg1 = new Arena<>(Eichhorn, Baummard);
        wg1.showdown();


    }
}


