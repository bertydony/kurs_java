package berty.zadania.obiektowka.cwiczenia.cwiczenia2;

public class Main {
    public static void main(String[] args) {

        Garnek garnek = new Garnek(10,6,"Black");

        System.out.println(garnek.kolor);

        String wiadomosc = garnek.gotuj(true);
        System.out.println(wiadomosc);
    }
}

