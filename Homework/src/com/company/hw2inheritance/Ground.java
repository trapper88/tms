package com.company.hw2inheritance;

public class Ground extends Transport {

    int wheels_number;
    int fuel_flow;

    Ground(int power, int max_speed, int mass, String brand, int wheels_number, int fuel_flow) {
        super(power, max_speed, mass, brand);
        this.wheels_number = wheels_number;
        this.fuel_flow = fuel_flow;
    }
}
