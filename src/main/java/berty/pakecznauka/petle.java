package berty.pakecznauka;

public class petle {

    public static void main (String[] args){

        for(int a = 0; a <= 5; a++){
            for(int b = 10; b>=0; b--){
                System.out.println("Liczba a: "+a+" Liczba b: "+ b);
            }
        }

        int tablica[] = new int[2];
        tablica[0] = 88;
        tablica[1] = 888;

        for(int i : tablica){
            System.out.println(i);
        }

        for(int i = 1; i<10; i++ ){
            i++;
            System.out.println(i);
        }

    }
}
