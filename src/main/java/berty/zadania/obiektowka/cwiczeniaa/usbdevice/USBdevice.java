package berty.zadania.obiektowka.cwiczeniaa.usbdevice;

public interface USBdevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
