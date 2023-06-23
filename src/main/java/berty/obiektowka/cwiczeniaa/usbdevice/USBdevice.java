package berty.obiektowka.cwiczeniaa.usbdevice;

public interface USBdevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
