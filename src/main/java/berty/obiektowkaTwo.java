package berty;

public class obiektowkaTwo {
    private int age;
    private String zawod;

    private boolean czyMaDzieci;

    private boolean onOff;

  // obiektowkaTwo(){
  //  }

    public obiektowkaTwo(int age, String zawod, boolean czyMaDzieci){
        this.age = age;
        this.zawod = zawod;
        this.czyMaDzieci = czyMaDzieci;
    }

    public int getAge() {
        return age;
    }

    public String getZawod() {
        return zawod;
    }

    public boolean isCzyMaDzieci() {
        return czyMaDzieci;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void getOnOff(){
        if(onOff){
            System.out.println("Swiatlo w domu jest wlaczone");
        }else{
            System.out.println("Swiatlo w domu jest wylaczone");
        }
    }
}
