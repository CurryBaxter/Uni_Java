package Kapitel5;


public class factorial_long {
    public long fak (int n) {
        long fact = 1;
        if (n < 0)
        {return 0;}
        else
            for (int i = 1; i <= n; ++i) {
                fact = fact * i;


            }
        return fact;

    }

    public static void main(String[] args) {
        Kapitel4.factorial_method fakBerechnung = new Kapitel4.factorial_method();
        for (int k = 10; k <= 20; ++k){
            System.out.println("Fakultät von " + k + ": " + fakBerechnung.fak(k));
        }

    }

}

