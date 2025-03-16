import java.util.Scanner;

public class Task7 {
    public static void solveTask7() {
        System.out.println("Program sprawdzy czy podane słowo jest palidromem");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String text = scanner.nextLine().trim();

        String palindrome = text.toUpperCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reversed)) {
            System.out.println("Podane słowo jest palidromem");
        } else {
            System.out.println("Niestety podane słowo nie jest palidromem");
        }
        scanner.close();
    }
}
//      Task7
//Stwórz program, który sprawdzi czy podany wyraz jest palindromem,
//czyli wyrażeniem, które czytane zarówno od przodu jak i od tyłu brzmi dokładnie tak samo.