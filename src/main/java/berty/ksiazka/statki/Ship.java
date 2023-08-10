package berty.ksiazka.statki;

public class Ship {
    private int[] shipPlace;
    private int hitsNumber=0;

    public void setShipPlace(int[] placement){
        shipPlace = placement;
    }

    public String check(int shoot){
        String result = "miss";
        for(int area : shipPlace){
            if(shoot == area){
                result = "HIT";
                hitsNumber++;
                break;
            }
        }
        if(hitsNumber == shipPlace.length){
            result = "SUNK";
        }
        System.out.println(result);
        return result;
    }

}
