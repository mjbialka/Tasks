import java.util.Scanner;

public class Task1 {
    public static void solveTask1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wykonajmy działania dla wpisanych liczb");
        System.out.println();
        System.out.println("Wpisz pierwszą liczbę: ");
        int numberA = Integer.parseInt(sc.nextLine());

        System.out.println();
        System.out.println("Wpisz drugą liczbę: ");
        int numberB = Integer.parseInt(sc.nextLine());

        System.out.println();
        System.out.println("Wynik dodawania: " + (numberA + numberB));
        System.out.println("Wynik odejmowania: " + (numberA - numberB));
        System.out.println("Wynik mnożenia: " + (numberA * numberB));
        System.out.println("Wynik dzielenia: " + (numberA / numberB));
    }
}
//        Task1
//  Stwórz program, który zapyta użytkownika o dwie liczby całkowite, a następnie wyświetli wyniki dodawania, odejmowania, mnożenia oraz dzielenia tych liczb.
//  Zakładając, że użytkownik podał liczby 10 i 5, wynik działania programu powinien być następujący:
//
//Wynik dodawania to 15
//Wynik odejmowania to 5
//Wynik mnożenia to 50
//Wynik dzielenia to 2