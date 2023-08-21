package Kapitel6;

public class floatingDivision {
    public double floatDivision(int argument1,int argument2){
        return (double) argument1 / argument2;

    }

    public static void main(String[] args) {
        floatingDivision Division1 = new floatingDivision();
        System.out.println(Division1.floatDivision(7, 2));
    }
}
