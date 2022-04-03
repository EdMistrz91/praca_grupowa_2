package pl.sda.arppl.pracawzespole;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KlasaRobert {
    public static void main(String[] args) {
        System.out.println("Jakie imie wariacie?");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        System.out.println("A nazwisko?");
        String nazwisko = scanner.next();
        System.out.println("a jaki masz numer buta?");
        int but = scanner.nextInt();
        System.out.println("Oj " + imie + " " + nazwisko + " " + "ale masz nogę! Twój rozmiar to " + but + "?");
    }
}
