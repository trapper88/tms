package com.company.hw2inheritance;

public class Air extends Transport {

    int scope;
    int takeoff_length;

    Air(int power, int max_speed, int mass, String brand, int scope, int takeoff_length) {
        super(power, max_speed, mass, brand);
        this.scope = scope;
        this.takeoff_length = takeoff_length;
    }
}
