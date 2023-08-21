package Kapitel4;

public class factorial_method {
        public int fak (int n) {
            int fact = 1;
            if (n < 0)
                {return 0;}
            else
                    for (int i = 1; i <= n; ++i) {
                    fact = fact * i;


                    }
                return fact;

            }

    public static void main(String[] args) {
            factorial_method fakBerechnung = new factorial_method();
        System.out.println("Fakultät von 5: " + fakBerechnung.fak(5));
        System.out.println("Fakultät von 10: " + fakBerechnung.fak(10));
        System.out.println("Fakultät von -4: " + fakBerechnung.fak(-4));
    }

}

