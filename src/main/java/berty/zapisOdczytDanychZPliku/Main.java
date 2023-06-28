package berty.zapisOdczytDanychZPliku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar tabeli");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] tabela = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print("Wiersz " + (i + 1) + ", Kolumna " + (j + 1) + ": ");
                tabela[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i <tabela.length; i++){
            System.out.println(" ");
            for(int j = 0; j < tabela[i].length; j++){
                System.out.print(tabela[i][j]+ " ");


            }
        }
    }
}
