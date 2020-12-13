package com.company.hw2inheritance;

import java.util.Scanner;

public class Cargo extends Ground {

    public int carrying;


    Cargo(int power, int max_speed, int mass, String brand, int wheels_number, int fuel_flow, int carrying) {
        super(power, max_speed, mass, brand, wheels_number, fuel_flow);
        this.carrying = carrying;
    }

    static void showparams(Cargo c) {
        System.out.print("\n" + "ГРУЗОВОЙ АВТОМОБИЛЬ" + "\n");
        System.out.println("\n" + "Мощность в л.с. = " + c.power + "\n" + "Максимальная скорость, км/ч = " + c.max_speed + "\n"
                + "Масса, кг = " + c.mass + "\n" + "Марка " + c.brand + "\n" + "Количество колес  = " + c.wheels_number + "\n" +
                "Расход топлива, л/100км =  " + c.fuel_flow + "\n" + "Грузоподъемность, кг =  " + c.carrying);
        Transport.kvt(c);
    }

    void carry(Cargo c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько килограмм груза хотите загрузить в грузовик?");
        int x = sc.nextInt();
        if (x <= c.carrying) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Нужен другой грузовик");
        }

    }
}

