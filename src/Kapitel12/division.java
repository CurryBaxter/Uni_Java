package Kapitel12;

import java.awt.*;

public class division {

    public int divisonFunction(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (Exception e) {
            System.out.println("Division durch Parametereingabe nicht möglich");
            return 0;
        }

    }

    public static void main(String[] args) {
        division Division1 = new division();
        System.out.println(Division1.divisonFunction(4,0));
        System.out.println(Division1.divisonFunction(4, 2));
    }
}
