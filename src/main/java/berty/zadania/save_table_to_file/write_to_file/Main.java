package berty.zadania.save_table_to_file.write_to_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        whenWriteStringUsingBufferedWritter_thenCorrect();
    }

    public static void whenWriteStringUsingBufferedWritter_thenCorrect()
            throws IOException {
        String str = "He";
        BufferedWriter writer = new BufferedWriter(new FileWriter("file", true));
        writer.write(str);
        writer.write("\n");
        String str2 = "He2";
        writer.write(str2);
        writer.write("\n\n");

        writer.close();
    }
}
