package berty.pakecznauka;

import java.util.Scanner;

public class zadanko2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program do sprawdzania liczb od najwiekszej do najmniejszej");
        System.out.println("Podaj liczbe miedzy 0-100");
        System.out.println("Podaj liczbe 1");
        a = scanner.nextInt();
        System.out.println("Podaj liczbe 2");
        b = scanner.nextInt();
        System.out.println("Podaj liczbe 3");
        c = scanner.nextInt();

        int tab[] = new int[3];
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;

        if (a > 100 || b > 100 || c > 100 || a == 0 || b == 0 || c == 0) {
            System.out.println("Podaj liczbe nie większą niż 100 i nie 0");
        } else {
            for (int i : tab) {
                if (a > b && b > c) {
                    System.out.print(a + " ");
                    System.out.print(b + " ");
                    System.out.print(c);
                    break;

                } else if (b > a && a > c) {
                    System.out.print(b + " ");
                    System.out.print(a + " ");
                    System.out.print(c);
                    break;
                } else if (c > a && a > b) {
                    System.out.print(c + " ");
                    System.out.print(a + " ");
                    System.out.print(b);
                    break;
                } else if (c > b && b > a) {
                    System.out.print(c + " ");
                    System.out.print(b + " ");
                    System.out.print(a);
                    break;
                }
            }
        }
    }
}