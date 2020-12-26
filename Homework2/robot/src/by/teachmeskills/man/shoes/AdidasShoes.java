package by.teachmeskills.man.shoes;

public class AdidasShoes implements Shoes {
    @Override
    public void takeOn() {
        System.out.println("Take on shoes by adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off shoes by adidas");
    }
}
