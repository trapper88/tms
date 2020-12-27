package by.teachmeskills.cosmodrome;

import java.util.Random;

public interface IStart {

    default boolean check() {
        Random r = new Random();
        int x = r.nextInt(3);
        if (x == 1) {
            return true;
        } else {
            return false;
        }
    }
    void startEngine();
    void start();
    String getName();
}
