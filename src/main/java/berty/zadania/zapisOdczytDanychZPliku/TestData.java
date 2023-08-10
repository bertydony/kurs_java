package berty.zadania.zapisOdczytDanychZPliku;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestData {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private List<int[][]>tables = new ArrayList<>();
    public void data() throws IOException {
        boolean continueLoop = true;


        while (continueLoop) {
            System.out.println(" ");
            System.out.println("Podaj wymiar tabeli");
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();

            int[][] table = new int[rows][columns];

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {
                    table[i][j] = random.nextInt(9) + 1;
                }
            }
            tables.add(table);
            displayTable(table);
            saveTableToFile(table);

            System.out.println("Czy chcesz kontynuowac?(Tak/Nie)");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("nie")){
                continueLoop=false;
            } else {
                System.out.println(" ");
                displayPreviousTables();
            }
        }
        saveAllTablesToFile();
    }


    private void displayTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
    private void saveTableToFile(int[][] table) throws IOException{
        File file = new File("table2.txt");
        PrintWriter printWriter = new PrintWriter(file);

            for (int i = 0; i < table.length; i++) {
                printWriter.println(" ");
                for (int j = 0; j < table[i].length; j++) {
                    printWriter.print(table[i][j] + " ");
                }
            }
            System.out.println("");
            System.out.println("Plik udało się zapisać");
            printWriter.close();

        }
        private void displayPreviousTables(){
            System.out.println("Poprzednie tabele: ");
            for(int[][] table : tables){
                displayTable(table);
            }
            System.out.println(" ");
        }

        private void saveAllTablesToFile() throws IOException{
        for(int i = 0; i < tables.size(); i++){
            int[][] table = tables.get(i);
            saveTableToFile(table);
            System.out.println("Tabela " + (i+1) + " zapisana do pliku");
            }
        }
    }

