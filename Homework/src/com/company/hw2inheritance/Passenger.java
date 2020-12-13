package com.company.hw2inheritance;

import java.util.Scanner;

public class Passenger extends Ground {

    String body;
    int passengers;
    private double dist;


    Passenger(int power, int max_speed, int mass, String brand, int wheels_number, int fuel_flow, String body, int passengers) {
        super(power, max_speed, mass, brand, wheels_number, fuel_flow);
        this.body = body;
        this.passengers = passengers;
    }

    static void showparams(Passenger p) {
        System.out.print("\n" + "ЛЕГКОВОЙ АВТОМОБИЛЬ" + "\n");
        System.out.println("\n" + "Мощность в л.с. = " + p.power + "\n" + "Максимальная скорость, км/ч = " + p.max_speed + "\n"
                + "Масса, кг = " + p.mass + "\n" + "Марка " + p.brand + "\n" + "Количество колес = " + p.wheels_number + "\n" +
                "Расход топлива, л/100км =  " + p.fuel_flow + "\n" + "Кузов " + p.body + "\n" + "Количество пассажиров  = " + p.passengers);
        Transport.kvt(p);
    }


    void distance(Passenger p) {
        System.out.println("Введите время движения автомобиля в часах (целое положительное число)");
        Scanner sc = new Scanner((System.in));
        int time = sc.nextInt();
        this.dist = p.max_speed * time;
        System.out.println("За время " + time + " ч., автомобиль " + p.brand + ", двигаясь с максимальной " + "\n" +
                "скоростью " + p.max_speed + " км/ч, проедет " + dist + " км и израсходует " + Math.round(p.fuel()) + " л. топлива");
    }

    private double fuel() {
        double fuel;
        fuel = dist / 100 * fuel_flow;
        return fuel;
    }
}
