package berty.obiektowka.cwiczeniaa.drive;

import berty.obiektowka.cwiczeniaa.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
