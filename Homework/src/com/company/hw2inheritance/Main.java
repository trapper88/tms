package com.company.hw2inheritance;


public class Main {
    public static void main(String[] args) {
        Passenger p = new Passenger(200, 220, 1990, "Audi", 4, 12, "Sedan", 4);
        Passenger.showparams(p);
        p.distance(p);

        Cargo c = new Cargo(500, 140, 5000, "MAN", 6, 18, 5000);
        Cargo.showparams(c);
        c.carry(c);

        Civil civil = new Civil(2000, 1100, 15000, "Airbus", 20, 1000, 50, true);
        Civil.showparams(civil);
        civil.passengersCheck(civil);

        Military military = new Military(5000, 800, 20000, "МИ", 25, 600, true, 3);
        Military.showparams(military);
        Military.fire(military);
        military.inj(military);


    }


}
