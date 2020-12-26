package by.teachmeskills.man;

import by.teachmeskills.man.jacket.Jacket;
import by.teachmeskills.man.pants.Pants;
import by.teachmeskills.man.shoes.Shoes;

public class Man {


    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Man(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void takeOn() {
        System.out.println("Man " + name);
        jacket.takeOn();
        pants.takeOn();
        shoes.takeOn();
    }

    public void takeOff() {
        System.out.println("Man " + name);
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
