package berty.zadania.calculator_refactor;

import berty.zadania.calculator_refactor.model.Calculator;
import berty.zadania.calculator_refactor.service.CalculatorLogic;

public class Main {
    public static void main(String[] args) {
        new CalculatorLogic(new Calculator(true)).doCalculation();
    }
}