package berty.obiektowka.cwiczenia.cwiczenia2;

public class Garnek {
    int srednica;
    int wysokosc;
    String kolor;

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj(boolean czyJeSol){
        if(czyJeSol){
            return "Tak jest sol";
        }else {
            return "Ni ma soli";
        }
    }
}
