import java.util.Scanner;

public class Task5 {
    public static void solveTask5() {
        Scanner sc = new Scanner(System.in);
        boolean runningProgram = true;

        System.out.println("Witaj!");

        while (runningProgram) {
            System.out.println("Jakie operacje chciałbyś wykonać? ");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyłącz program");
            System.out.println();
            System.out.println("jako wybór wpisz numer operacji (1/2/3/4)");

            int choice = sc.nextInt();

            if (choice == 5) {
                runningProgram = false;
                System.out.println("Zamykam program...");
                break;
            }

            System.out.println("Podaj pierwszą liczbę: ");
            double number1 = sc.nextDouble();

            System.out.println("Podaj drugą liczbę: ");
            double number2 = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Wynik dodawania: " + add(number1, number2));
                case 2 -> System.out.println("Wynik odejmowania: " + subtraction(number1, number2));
                case 3 -> System.out.println("Wynik mnożenia: " + multiplication(number1, number2));
                case 4 -> {
                    if (number2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Wynik dzielenia: " + division(number1, number2));
                    }
                }
                default -> System.out.println("Nieprawidłowa wartość, spróbuj jeszcze raz.");
            }
            System.out.println();
        }
        sc.close();
    }

    private static Double multiplication(double number1, double number2) {
        return number1 * number2;
    }


    private static Double division(double number1, double number2) {
        return number1 / number2;
    }

    private static Double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    private static Double add(double number1, double number2) {
        return number1 + number2;
    }


}
//        Task5 - kalkulator z interfejsem
//Stwórz program, który zapyta użytkownika o dwie liczby całkowite, a następnie zapyta o operację,
//którą ma wykonać - dodawanie, odejmowanie, mnożenie, dzielenie.
//Wynik operacji wyświetl w konsoli.