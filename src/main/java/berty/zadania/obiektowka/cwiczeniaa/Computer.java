package berty.zadania.obiektowka.cwiczeniaa;

import berty.zadania.obiektowka.cwiczeniaa.drive.Drive;
import berty.zadania.obiektowka.cwiczeniaa.usbdevice.USBdevice;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBdevice> usbDevices=new ArrayList<>();

    public Computer(Monitor monitor, Drive drive){
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public List<USBdevice> getUsbDevices() {
        return usbDevices;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }
}
