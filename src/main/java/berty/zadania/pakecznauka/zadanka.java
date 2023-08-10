package berty.zadania.pakecznauka;

import java.util.Scanner;

public class zadanka {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int p = a/2;

        if(a==0 || a==1){
            System.out.println("To nie liczba pierwsza");
        }else if(a/2==0){
            System.out.println("Liczba pierwsza");
        } else{
            System.out.println("nie nie");
        }


    }
}
