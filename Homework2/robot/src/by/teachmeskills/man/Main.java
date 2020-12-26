package by.teachmeskills.man;

import by.teachmeskills.man.jacket.AdidasJacket;
import by.teachmeskills.man.pants.SolomonPants;
import by.teachmeskills.man.shoes.NikeShoes;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Tom", new AdidasJacket(), new SolomonPants(), new NikeShoes());

        man.takeOn();
        man.takeOff();
    }
}
