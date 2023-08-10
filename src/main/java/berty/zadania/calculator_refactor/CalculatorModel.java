package berty.zadania.calculator_refactor;

public class CalculatorModel {
    CalculatorLogic logic = new CalculatorLogic();
    public void calculator() {
        while (logic.loop) {
            logic.getNumbers();
            logic.chooseOperatorAndPrintScore();
            logic.doYouWantContinue();
        }
    }
}
