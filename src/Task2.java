import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej! Jak masz na imię?");
        String name = sc.nextLine();
        System.out.println("Witaj " + name);

        System.out.println("Podaj jeszcze nazwisko");
        String lastname = sc.nextLine();
        System.out.println("Witaj " + lastname);

        System.out.println("Ile masz lat?");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Witaj " + age);

        System.out.println("Świetnie! Dobra robota.");

        System.out.println();
        System.out.println("Informacje które podałeś:");
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Wiek: " + age);

    }
}

//      Task2
// Stwórz program, który zapyta użytkownika o imię, nazwisko oraz wiek, a następnie wyświetli te dane w następującej formie:
//
//Imie: Jan
//Nazwisko: Kowalski
//Wiek: 35