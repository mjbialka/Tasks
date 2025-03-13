import java.util.Scanner;

public class Task3 {
    public static void solveTask3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        String name = sc.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String lastname = sc.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Uczysz się programowania? (tak/nie)");

        boolean answer = sc.nextLine().toLowerCase().equals("tak");

        System.out.println("Cześć " + name + ", słyszałem, że masz " + age + " lat i uczysz się programowania. Czy to prawda?");
        System.out.println(answer);
        String initials = (name.charAt(0) + " " + lastname.charAt(0));
        System.out.println("Czy twoje inicjały to " + initials + " ?");
        boolean answer2 = sc.nextLine().toLowerCase().equals("tak");

        System.out.print(answer2);

    }
}
//        Task3
// Napisz program, który wyświetli o tobie kilka informacji w postaci takiej jak przedstawiono poniżej.
// Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
// true
//Czy Twoje inicjały to J K?
//Tak, true
//
//W zadaniu wykorzystaj nie tylko napisy zapisane w cudzysłowie, ale również podane typy danych:
//
//liczby (int)
//znaki (char),
//typ logiczny (boolean).