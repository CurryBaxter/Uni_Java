package Kapitel5;

public class charToAscii {
    public int conversion(char a){
        return (int) a;
    }

    public static void main(String[] args) {
        charToAscii Konversion1 = new charToAscii();
        System.out.println(Konversion1.conversion('A'));
    }
}
