package berty.zadania.obiektowka;

public class Home {
    public static void main(String[] args) {
        Dog rex = new Dog();

        rex.speak();
        rex.setSize(50);
        System.out.println(rex.getSize());
    }
}
