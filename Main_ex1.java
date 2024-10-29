import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();

        scanner.close();

        try {
            FileWriter writer = new FileWriter("Osoba.txt");
            writer.write("Imie: " + imie + "\n");
            writer.write("Nazwisko: " + nazwisko + "\n");
            writer.write("Wiek: " + wiek + "\n");
            writer.close();
            System.out.println("Dane zostaly zapisane do pliku.");
        } catch (IOException e) {
            System.out.println("Wystapil blad podczas zapisywania danych do pliku.");
            e.printStackTrace();
        }
    }
}
