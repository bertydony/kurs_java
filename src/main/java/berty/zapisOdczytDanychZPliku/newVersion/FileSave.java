package berty.zapisOdczytDanychZPliku.newVersion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
    public String fileName = "finalFile.txt";
    public int [] [] table;


    public void saveFile(int table[][]) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        for (int i = 0; i < table.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < table[i].length; j++) {
                writer.write(table[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("Zapisano do pliku");
        writer.close();
       this.table=table;
    }
}
