package berty.obiektowka.cwiczeniaa.usbdevice;

public class MemoryStick implements USBdevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name){
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Memory Stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject MS first");
            return false;
        }else
        System.out.println("Memory Stick disconnected");
        return true;
    }

    @Override
    public String getName() {
        return getName();
    }
}
