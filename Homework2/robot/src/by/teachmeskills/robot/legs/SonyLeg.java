package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагают ноги Sony" + "\n");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
