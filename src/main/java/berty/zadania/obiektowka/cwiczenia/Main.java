package berty.zadania.obiektowka.cwiczenia;

public class Main {
    public static void main(String[] args) {

        Snake cobra = new Snake();
        Snake python = new Snake();

        cobra.sounds();

        cobra.setLength(20);
        System.out.println(cobra.getLength());

        System.out.println(cobra.czyJestDlugi());

        System.out.println(cobra.getVenomous(true));
    }
}
