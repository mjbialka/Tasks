import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void solveTask6() {
        String text = "   Become Java developer in 2025  ";

        String[] list = text.trim().toUpperCase().split("\\s+");

        String result = String.join(" ", Arrays.copyOfRange(list, 1, list.length));

        System.out.println(result);


    }
}
//          Task6 - przsekształcenie Stringa
//Stwórz program, który przekształci (a następnie wyświetli na konsoli) obiekt typu String o wartości
// "   Become Java developer in 2025  "
//w następujący sposób:
//
//usunięte zostaną spacje z początku i końca
//
//wszystkie litery zostaną zamienione na duże
//
//ze Stringa usunięte zostanie pierwsze słowo
//Wynik działania programu powinien być następujący:
//        "JAVA DEVELOPER IN 2025"