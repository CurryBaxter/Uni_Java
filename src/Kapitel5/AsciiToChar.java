package Kapitel5;

public class AsciiToChar {
    public char ascii_conversion(int a){
         return (char) a;
    }

    public static void main(String[] args) {
    AsciiToChar Konversion1 = new AsciiToChar();
        System.out.println(Konversion1.ascii_conversion(65));

        charToAscii Konversion2 = new charToAscii();
        System.out.println(Konversion2.conversion('A'));
    }


}
