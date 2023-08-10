package berty.zadania.naukajava;

import java.util.Random;
import java.util.Scanner;

public class Randoom {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) +1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while(!wasNumberGuessed){
            System.out.println("Podaj liczbe");
            int userNumber = scanner.nextInt();

            if(numberToGuess < userNumber){
                System.out.println("Liczba jest za duza");
            }else if(numberToGuess > userNumber){
                System.out.println("Liczba za mala");
            } else {
                System.out.println("Brawo to ta liczba");
                wasNumberGuessed = true;
            }
        }
    }
}
