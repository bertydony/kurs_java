package berty.zapisOdczytDanychZPliku.newVersion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Data {

    public static final String fileName = "finalFile.txt";
    public static int rows;
    public static int columns;


    public void userData() throws IOException {
        boolean continueLoop = true;
        while(continueLoop) {
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

            FileSave fileSave = new FileSave();
            fileSave.saveFile(table);

            System.out.println("\nChcesz kontynuowac? tak/nie");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("nie")){
                continueLoop = false;
            }
        }

    }

    public void displayTable(int table[][]) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
    }

}


