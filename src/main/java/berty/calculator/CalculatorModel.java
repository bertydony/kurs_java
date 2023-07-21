package berty.calculator;

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
