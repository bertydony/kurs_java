package berty.obiektowka.cwiczeniaa;

import berty.obiektowka.cwiczeniaa.drive.HDDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();
        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("muzyka.mp3"));
        drive.listFiles();
    }
}
