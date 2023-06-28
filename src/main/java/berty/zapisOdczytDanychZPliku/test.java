package berty.zapisOdczytDanychZPliku;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        Random random = new Random();

                System.out.println("Podaj wymiar tabeli");
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();

                int[][] tabela = new int[rows][columns];

                for (int i = 0; i < rows; i++) {

                    for (int j = 0; j < columns; j++) {
                        tabela[i][j] = random.nextInt(10)+1;
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


