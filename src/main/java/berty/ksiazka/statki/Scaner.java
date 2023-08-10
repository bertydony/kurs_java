package berty.ksiazka.statki;

import java.util.Scanner;

public class Scaner {
    Scanner scanner = new Scanner(System.in);

    public int inputData(String message){
        System.out.println(message + ": ");
        return scanner.nextInt();
    }
}
