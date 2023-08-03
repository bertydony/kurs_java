package berty.statki;

import java.util.Scanner;

public class Ship {
    Scanner scanner = new Scanner(System.in);
    int[] shipPlace;
    int hitsNumber=0;

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
