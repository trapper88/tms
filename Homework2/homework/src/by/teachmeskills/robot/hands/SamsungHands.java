package by.teachmeskills.robot.hands;

public class SamsungHands implements IHand {

    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руки Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
