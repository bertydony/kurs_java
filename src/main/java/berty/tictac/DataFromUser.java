package berty.tictac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFromUser {

    Scanner scanner = new Scanner(System.in);

    public void data() {
        System.out.println("Podaj wiersz, kolumne oraz znak jakim grasz( X or O)");

        int wiersz = scanner.nextInt();
        int kolumna = scanner.nextInt();
        String xOrO = scanner.next();

        if (xOrO.equalsIgnoreCase("X") || xOrO.equalsIgnoreCase("O")) {
            zapiszDane(wiersz, kolumna, xOrO);
            System.out.println("Twoje koordynaty to: ");
            System.out.println("Wiersz: " + wiersz + "Kolumna: " + kolumna);
            System.out.println("Grasz: " + xOrO);
        } else {
            System.out.println("Wpisz x lub o");
        }
    }

    public void zapiszDane(int wiersz, int kolumna, String xOrO) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dane.txt"))) {
            writer.write("Wiersz: " + wiersz);
            writer.newLine();
            writer.write("Kolumna: " + kolumna);
            writer.newLine();
            writer.write("Grasz: " + xOrO);
            System.out.println("Dane zostały zapisane do pliku: dane.txt");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
