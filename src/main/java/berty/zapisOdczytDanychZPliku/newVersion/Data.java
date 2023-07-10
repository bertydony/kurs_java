package berty.zapisOdczytDanychZPliku.newVersion;

import java.util.Random;
import java.util.Scanner;

public class Data {


    public static int rows;
    public static int columns;
    public static final String fileName = "finalFile";


    public void userData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy:");
        rows = scanner.nextInt();
        System.out.println("Podaj ilosc kolumn");
        columns = scanner.nextInt();

        Random random = new Random();

        int[][] table = new int[rows][columns];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }

    }
}


