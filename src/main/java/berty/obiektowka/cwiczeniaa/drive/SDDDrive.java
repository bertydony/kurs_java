package berty.obiektowka.cwiczeniaa.drive;

import berty.obiektowka.cwiczeniaa.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive{

    Map<String, File> files = new HashMap<>();
    @Override
    public void addFile(File file) {
        files.put(file.toString(), file);

    }

    @Override
    public void listFiles() {
        Collection<File> fileCollection = files.values();

        for(File file : fileCollection){
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }
}
