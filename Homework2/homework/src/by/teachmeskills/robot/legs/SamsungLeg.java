package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Шагают ноги Samsung" + "\n");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
