package berty.zapisOdczytDanychZPliku.newVersion;

import java.io.*;

public class FileSave {
    public String fileName = "finalFile.txt";
    public int[][] table;


    public int[][] saveFile(int table[][]) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        for (int i = 0; i < table.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < table[i].length; j++) {
                writer.write(table[i][j] + " ");
                writer.newLine();
            }
        }
        System.out.println("\nZapisano do pliku");
        writer.close();
        return table;
    }

    public void readFile(int[][] table) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("\n" + line);
        }
        reader.close();
    }
}


