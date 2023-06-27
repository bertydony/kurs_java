package berty.tictac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFromUser {

    private Scanner scanner;
    private CheckIfYouWon checkIfYouWon;
    private Field field;

    public DataFromUser() {
        scanner = new Scanner(System.in);
        checkIfYouWon = new CheckIfYouWon();
        field = new Field();
    }

    public void data() {
        System.out.println("Podaj wiersz, kolumnę oraz znak, którym grasz (X or O)");

        int wiersz = scanner.nextInt();
        int kolumna = scanner.nextInt();
        String xOrO = scanner.next();

        if (xOrO.equalsIgnoreCase("X") || xOrO.equalsIgnoreCase("O")) {
            zapiszDane(wiersz, kolumna, xOrO);
            System.out.println("Twoje koordynaty to: ");
            System.out.println("Wiersz: " + wiersz + " Kolumna: " + kolumna);
            System.out.println("Grasz: " + xOrO);

            boolean gameWon = false;
            while (!gameWon) {
                field.displayField();
                gameWon = checkIfYouWon.isWon(xOrO);
            }
        } else {
            System.out.println("Wpisz X lub O");
        }
    }

    private void zapiszDane(int wiersz, int kolumna, String xOrO) {
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

    public boolean deleteData(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
