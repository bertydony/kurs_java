package berty.zadania.calculator_refactor.model;

public class Calculator {
    private String display;

    private double numberButton1;
    private double numberButton2;
    private char operatorButton;

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setNumberButton1(double numberButton1) {
        this.numberButton1 = numberButton1;
    }

    public void setNumberButton2(double numberButton2) {
        this.numberButton2 = numberButton2;
    }

    public void setOperatorButton(char operatorButton) {
        this.operatorButton = operatorButton;
    }

    private boolean isOn;

    public Calculator(boolean isOn) {
        this.isOn = isOn;
    }

    public void display() {
        System.out.println(display);
    }

    public void add(double numberButton1, double numberButton2) {
        display = String.valueOf(numberButton1 + numberButton2);
    }

    public boolean isOnOf() {
        return isOn;
    }

    public void setOnOf(boolean on) {
        isOn = on;
    }

    public String getDisplay() {
        return display;
    }

    public double getNumberButton1() {
        return numberButton1;
    }

    public double getNumberButton2() {
        return numberButton2;
    }

    public char getOperatorButton() {
        return operatorButton;
    }
}
