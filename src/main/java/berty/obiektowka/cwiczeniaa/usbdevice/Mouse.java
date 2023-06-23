package berty.obiektowka.cwiczeniaa.usbdevice;

public class Mouse implements USBdevice{

    private String name;

    public Mouse(String name){
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconnected");
        return true;
    }

    @Override
    public String getName() {
        return null;
    }
}
