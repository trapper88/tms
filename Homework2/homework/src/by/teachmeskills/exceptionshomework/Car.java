package by.teachmeskills.exceptionshomework;

import java.util.Random;

public class Car {

    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void start() {
        try {
            Random r = new Random();
            int x = r.nextInt(21);
            if (x % 2 == 0) {
                throw new StartException();
            }
        } catch (StartException e) {
            System.out.println("Exception: " + e.toString());

        } finally {
            System.out.println("Car " + brand + " whith max speed " + speed + ", which costs " + price +
                    " started");

        }
    }
}
