package berty.pakecznauka;

import java.util.Random;

public class zadanko1 {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i<3;i++){
            int randomNum = random.nextInt(5000)+1;
            System.out.println(randomNum);

        }
    }
}
