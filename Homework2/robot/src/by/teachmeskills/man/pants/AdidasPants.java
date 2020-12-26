package by.teachmeskills.man.pants;

public class AdidasPants implements Pants {
    @Override
    public void takeOn() {
        System.out.println("Take on pants by adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off pants by adidas");
    }
}
