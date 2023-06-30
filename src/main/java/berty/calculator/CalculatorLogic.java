package berty.calculator;

import java.util.Scanner;

public class CalculatorLogic {

    Scanner scanner = new Scanner(System.in);
    double a, b, result;
    char operator;


    boolean loop = true;
    public void doYouWantContinue() {
        System.out.println("Lecimy dalej? T/N");
        String option = scanner.next();
        if (option.equalsIgnoreCase("n")) {
            loop = false;
        } else if (option.equalsIgnoreCase("t")) {
            System.out.println("Lecimy dalej");
        }
    }

    public void chooseOperatorAndPrintScore() {
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Wynik dodawania: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Wynik odejmowania: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Wynik mnozenia: " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("Wynik dzielenia: " + result);
                break;
            default:
                System.out.println("Podaj prawidłowy operator");
        }
    }

    public void getNumbers() {
        System.out.println("Podaj pierwsza liczbe");
        a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe");
        b = scanner.nextDouble();
        System.out.println("Podaj operator");
        operator = scanner.next().charAt(0);
    }
}
