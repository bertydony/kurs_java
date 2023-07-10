package berty.zapisOdczytDanychZPliku.newVersion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Data {

    public static final String fileName = "finalFile.txt";
    public static int rows;
    public static int columns;



    public void userData() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy:");
        rows = scanner.nextInt();
        System.out.println("Podaj ilosc kolumn");
        columns = scanner.nextInt();

        Random random = new Random();
        int[][] table = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Twoja tabelka:\nrows: " + rows + "\ncolumns: " + columns);
        displayTable(table);
        saveFile(table);
    }
    public void displayTable(int table[][]){
        for (int i = 0; i < table.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
    }
    public void saveFile(int table[][]) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        for (int i = 0; i < table.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < table[i].length; j++) {
                writer.write(table[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Zapisano do pliku");
        writer.close();
    }
}


