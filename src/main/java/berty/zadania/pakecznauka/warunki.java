package berty.zadania.pakecznauka;

import java.util.Scanner;

public class warunki {
    public static void main (String[] args) {

        int b = 10;
        int x = 5;
        if (b > x){
            for(int a = 10; a>5; a--){
                System.out.println(a);
            }
        } else if(b!=7){
            System.out.println("Git");
        }

        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            if(i==5)
                break;

        }
        System.out.println();
        for(int i = 0; i<10; i++){
            if(i%2==0) continue;
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Podaj imie byku");
       name = scanner.next();

            System.out.println("Twoje imie to: " + name);


    }
}
