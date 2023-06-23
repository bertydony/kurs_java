package berty.obiektowka.cwiczenia;

public class Animals {
private int length;
private boolean isVenomous;



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String czyJestDlugi(){
        if(length>10){
            return "Dlugi waz";
        }else{
            return " Krotki";
        }
    }

    public String getVenomous(boolean isVenomous) {
        if(isVenomous){
            return "Jest jadowity";
        }else{
            return "Nie jest jadowity";
        }

    }
}
