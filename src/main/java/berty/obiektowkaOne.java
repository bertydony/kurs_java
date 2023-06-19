package berty;

public class obiektowkaOne {
    public static void main(String[] args) {
        obiektowkaTwo andrzej = new obiektowkaTwo(30, "strazak", false);
        obiektowkaTwo marcin = new obiektowkaTwo(23,"policjant", true);

        System.out.println(andrzej.getAge()+" "+andrzej.getZawod()+" " + andrzej.isCzyMaDzieci());
        System.out.println(marcin.getAge()+" "+marcin.getZawod()+ " " + marcin.isCzyMaDzieci() );

        andrzej.getOnOff(); // domyslna wartoscia dla geterow jest false
        andrzej.setOnOff(true);
        andrzej.getOnOff();
    }
}
