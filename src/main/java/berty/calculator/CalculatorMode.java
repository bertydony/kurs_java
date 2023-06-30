package berty.calculator;

import java.util.Scanner;

public class CalculatorMode {
    CalculatorLogic logic = new CalculatorLogic();
    public void calculator() {
        while (logic.loop) {
            logic.getNumbers();
            logic.chooseOperatorAndPrintScore();
            logic.doYouWantContinue();
        }
    }



}
