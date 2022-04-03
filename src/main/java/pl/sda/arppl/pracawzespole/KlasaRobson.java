package pl.sda.arppl.pracawzespole;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KlasaRobson {
    public static void main(String[] args) {
        System.out.println("Podaj imie!");
        Scanner scanner = new Scanner(System.in);
        String imie1 = scanner.next();
        System.out.println("Podaj drugie imie!");
        String imie2 = scanner.next();
        System.out.println("podaj dowolną liczbę z przecinkiem :)");
float a =scanner.nextFloat();
        System.out.println("podaj kolejną dowolną liczbę z przecinkiem :P");
        float b =scanner.nextFloat();
        float x = a + b;
                float y = a - b;
        System.out.println("Hej! " + imie1 + " "+ imie2 + " Suma tych liczb wynosi " + x + " , a różnica " + y);



    }
}
