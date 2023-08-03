package berty.statki;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
}
