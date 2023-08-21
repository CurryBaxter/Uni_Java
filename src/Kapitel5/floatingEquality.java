package Kapitel5;

public class floatingEquality {
    public boolean equality(float a,float b){
        if (a-b <= 0.001){
            return true;
        }
        return a == b;
    }

    public static void main(String[] args) {
        floatingEquality Vergleich1 = new floatingEquality();
        System.out.println(Vergleich1.equality(6.15432F, 6.15433F));
    }
}