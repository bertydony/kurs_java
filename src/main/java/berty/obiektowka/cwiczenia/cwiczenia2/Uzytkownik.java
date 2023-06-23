package berty.obiektowka.cwiczenia.cwiczenia2;

public class Uzytkownik {
    private String name;
    private int age;

    public Uzytkownik(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            throw new RuntimeException("Blad");
        }
    }
}
