package berty.zadania.pakecznauka;

public class nauka {
    public static void main (String[] args)
    {
        int tab[] = new int[7];
        tab[0] = 6;
        tab[1] = 2;
        tab[2] = 1;
        tab[3] = 7;
        tab[4] = 9;

        for(int i = 0; i<tab.length; i++ ) { // int i - inicjacja zmiennej, i<7 to warunek kiedy sie ma konczyc petla, i++ to inkrementacja, gdy warunek jest spelniany.
            System.out.println("Tablica "+i+": " + tab[i]);
        }

        for(int i : tab){ // to jest petla do interowania po tablicach i kolekcjach, nie wymaga jak przy zwyklej wpisywania w momencie wyswietlania tab[i]
            System.out.println(i);
        }
        int n = 10;
        while(n>=0){
            System.out.println("To "+n);
            n--;
        }

        do{
            System.out.println("Tekst");
            n++;
        }
        while(n>5);


        int table[][] = {{2,4,6}, {1,3,5}};
        for(int i = 0;i<table.length; i++){
            System.out.println("");
            for(int j = 0; j< table[i].length; j++){
                System.out.print(table[i][j] + " ");
            }
        }
    }
}
