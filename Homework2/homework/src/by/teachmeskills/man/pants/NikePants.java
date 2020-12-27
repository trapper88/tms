package by.teachmeskills.man.pants;

public class NikePants implements Pants {
    @Override
    public void takeOn() {
        System.out.println("Take on pants by nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off pants by nike");
    }
}
