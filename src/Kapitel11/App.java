package Kapitel11;

public class App {

    public static void main(String[] args) {
        Uhu uhu = new Uhu(5,5);
        Baummarder baummarder = new Baummarder(3,3);
        Eichhoernchen eichhoernchen = new Eichhoernchen(1,1);
        eichhoernchen.eat(baummarder);
        System.out.println(eichhoernchen.getGewicht());
        System.out.println(baummarder.AnimalAlive());
        eichhoernchen.verdauen();
        System.out.println(eichhoernchen.getGewicht());
    }
}
