package com.company.hw2inheritance;

public class Transport {

    int power;
    int max_speed;
    int mass;
    String brand;


    Transport(int power, int max_speed, int mass, String brand) {
        this.power = power;
        this.max_speed = max_speed;
        this.mass = mass;
        this.brand = brand;
    }

    static void kvt(Transport t) {
        double kvt = t.power / 0.74;
        System.out.println("Мощность в кВт = " + Math.round(kvt));
    }

}
