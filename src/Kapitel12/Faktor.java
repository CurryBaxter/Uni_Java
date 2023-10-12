package Kapitel12;

public class Faktor {

    public int fak(int a){
        int fact = 1;

        if (a <= 0)
            throw new IllegalArgumentException("Negative Faktoren sind nicht definiert");

        for ( int i = 1; i <= a; i++ ){
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Faktor FaktorTest = new Faktor();
        try {
            System.out.println(FaktorTest.fak(10));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }


        }
}
