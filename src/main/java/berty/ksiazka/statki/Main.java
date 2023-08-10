package berty.ksiazka.statki;

public class Main {
    public static void main(String[] args) {

    int numberOfMoves = 0;
    Ship ship = new Ship();
    Scaner message = new Scaner();

    int randomNumber = (int)(Math.random()*5);
    int[] placement = {randomNumber, randomNumber+1,randomNumber+2};

    ship.setShipPlace(placement);
    boolean isThere = true;

    while(isThere){
        int area = message.inputData("Type number");
        String result = ship.check(area);
        numberOfMoves++;
        if(result.equals("SUNK")){
            isThere = false;
            System.out.println(numberOfMoves +" moves");
            }
        }
    }
}
