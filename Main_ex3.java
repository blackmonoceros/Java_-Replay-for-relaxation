import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String data_godzina = "zapis.txt";

        try (FileWriter fileWriter = new FileWriter(data_godzina)) {
            Date currentDate = new Date();
            fileWriter.write(currentDate.toString());
            System.out.println("Biezaca data i godzina zostaly zapisane do pliku.");
        } catch (IOException e) {
            System.out.println("Wystapil blad podczas zapisu do pliku.");
            e.printStackTrace();
        }
    }
}