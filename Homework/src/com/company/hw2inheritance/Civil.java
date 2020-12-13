package com.company.hw2inheritance;

import java.util.Scanner;

public class Civil extends Air {

    int passengers;
    boolean business;

    Civil(int power, int max_speed, int mass, String brand, int scope, int takeoff_length, int passengers, boolean business) {
        super(power, max_speed, mass, brand, scope, takeoff_length);
        this.passengers = passengers;
        this.business = business;
    }

    static void showparams(Civil civil) {
        System.out.print("\n" + "ГРАЖДАНСКИЙ САМОЛЕТ" + "\n");
        System.out.println("\n" + "Мощность в л.с. = " + civil.power + "\n" + "Максимальная скорость, км/ч = " + civil.max_speed + "\n"
                + "Масса, кг = " + civil.mass + "\n" + "Марка " + civil.brand + "\n" + "Размах крыльев, м  = " + civil.scope + "\n" +
                "Длина полосы, м =  " + civil.takeoff_length + "\n" + "Пассажировместимость =  " + civil.passengers + "\n" + "Наличие бизнес-класса - "
                + civil.business);
        Transport.kvt(civil);
    }

    void passengersCheck(Civil civil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько пассажиров хотите посадить в самолет?");
        int x = sc.nextInt();
        if (x <= civil.passengers) {
            System.out.println("Полетели");
        } else {
            System.out.println("Придется кого-то высадить");
        }
    }
}
