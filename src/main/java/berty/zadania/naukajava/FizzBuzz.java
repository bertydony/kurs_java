package berty.zadania.naukajava;

public class FizzBuzz {

    public static void main(String[] args) {
//CZESC Bartek

        for(int i = 1; i<= 100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz");
            } else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}
