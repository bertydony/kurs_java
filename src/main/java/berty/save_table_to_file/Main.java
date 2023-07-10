package berty.save_table_to_file;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Get from user row and column for table
 * 2. Save Table in File
 * 3. When rerun program, read all saved table from file
 */

public class Main {
    public static final String fileName = "tables.txt";
    public static int row;
    public static int column;

    public static void main(String[] args) {

        

        //1
        Scanner in = new Scanner(System.in);
        System.out.println("Please give me row");
        row = in.nextInt();
        System.out.println("Please give me column");
        column = in.nextInt();


        Random rand = new Random();

        //2
        int[][] table = new int[row][column];

        for (int i = 0; i < table.length; i++)
            for (int j = 0; j < table[i].length; j++)
                table[i][j] = rand.nextInt(9);

        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }

        //TODO save table

    }

}
