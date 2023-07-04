package berty.praktykaUdemy;

public class Warunki {
    public static void main(String[] args) {
        int wiek = 25;
        if(wiek<15){
            System.out.println("Dalej sie uczysz");
        }else if(wiek>=18 && wiek<65){
            System.out.println("mozesz pracowac");
        } else if (wiek >= 65) {
            System.out.println("Mozesz isc na emerture");
        }
    }
}
