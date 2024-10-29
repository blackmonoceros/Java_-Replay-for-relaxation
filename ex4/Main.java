import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produkt[] produkty = new Produkt[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Wprowadź dane produktu " + (i + 1) + ":");
            System.out.print("Nazwa: ");
            String nazwa = scanner.nextLine();
            System.out.print("Cena: ");
            double cena = scanner.nextDouble();
            System.out.print("Liczba sztuk: ");
            int liczbaSztuk = scanner.nextInt();
            scanner.nextLine();

            produkty[i] = new Produkt(nazwa, cena, liczbaSztuk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Dane produktu " + (i + 1) + ":");
            System.out.println("Nazwa: " + produkty[i].getNazwa());
            System.out.println("Cena: " + produkty[i].getCena());
            System.out.println("Liczba sztuk: " + produkty[i].getLiczbaSztuk());
        }

        System.out.print("Czy chcesz zapisać do pliku? (Tak/Nie): ");
        String odpowiedz = scanner.nextLine();

        if (odpowiedz.equalsIgnoreCase("Tak")) {
            try {
                FileWriter writer = new FileWriter("produkty.txt");
                for (int i = 0; i < 3; i++) {
                    writer.write("Produkt " + (i + 1) + ":\n");
                    writer.write("Nazwa: " + produkty[i].getNazwa() + "\n");
                    writer.write("Cena: " + produkty[i].getCena() + "\n");
                    writer.write("Liczba sztuk: " + produkty[i].getLiczbaSztuk() + "\n");
                }
                writer.close();
                System.out.println("Dane zostały zapisane do pliku.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
