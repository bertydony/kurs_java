package berty.zadania.obiektowka.cwiczeniaa.drive;

import berty.zadania.obiektowka.cwiczeniaa.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
