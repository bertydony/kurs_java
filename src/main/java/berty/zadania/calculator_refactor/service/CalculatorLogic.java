package berty.zadania.calculator_refactor.service;

import berty.zadania.calculator_refactor.model.Calculator;

import java.util.Scanner;

public class CalculatorLogic {
    private final Calculator calculator;
    private final Scanner scanner = new Scanner(System.in);

    public CalculatorLogic(Calculator calculator) {
        this.calculator = calculator;
    }

    public void doCalculation() {
        while (calculator.isOnOf()) {
            getNumbers();
            chooseOperatorAndPrintScore();
            doYouWantContinue();
        }
    }

    private void doYouWantContinue() {
        System.out.println("Lecimy dalej? T/N");
        String option = scanner.next();
        if (option.equalsIgnoreCase("n")) {
            calculator.setOnOf(false);
        } else if (option.equalsIgnoreCase("t")) {
            System.out.println("Lecimy dalej");
            calculator.setOnOf(true);
        }
    }

    private void chooseOperatorAndPrintScore() {
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

    private void getNumbers() {
        System.out.println("Podaj pierwsza liczbe");
        calculator.setNumberButton1(scanner.nextDouble());
        System.out.println("Podaj druga liczbe");
        b = scanner.nextDouble();
        System.out.println("Podaj operator");
        operator = scanner.next().charAt(0);
    }


}
