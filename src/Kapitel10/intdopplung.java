package Kapitel10;

public class intdopplung{
    public static int hauptmethodeInt(int a1){
        return hilfsmethodeInt(a1) ;
    }

    public static int hilfsmethodeInt(int parameter){
        return parameter * 2;

    }
    public static void main(String[]args){
        System.out.println(hauptmethodeInt(2));

    }
}


