package berty.tictac;

public class Field {
    private String[][] fields;

    public Field() {
        fields = new String[3][3];
        for (int wiersz = 0; wiersz < 3; wiersz++) {
            for (int kolumna = 0; kolumna < 3; kolumna++) {
                fields[wiersz][kolumna] = " ";
            }
        }
    }



    public void displayField() {
        System.out.println("-------------");
        for (int wiersz = 0; wiersz < 3; wiersz++) {
            System.out.print("| ");
            for (int kolumna = 0; kolumna < 3; kolumna++) {
                System.out.print(fields[wiersz][kolumna] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}