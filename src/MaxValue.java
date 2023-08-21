import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int input;

        while (true) {
            System.out.print("Gib eine Zahl ein (oder 'exit' zum Beenden): ");
            String userInput = scanner.nextLine();

            if (userInput.equals("exit")) {
                break;
            }

            try {
                input = Integer.parseInt(userInput);
                if (input > max) {
                    max = input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte gib eine ganze Zahl ein.");
            }
        }

        System.out.println("Der maximale Wert ist: " + max);
    }
}