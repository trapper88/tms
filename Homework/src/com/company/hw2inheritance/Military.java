package com.company.hw2inheritance;

import java.util.Scanner;

public class Military extends Air {

    boolean injection;
    int rockets;

    static int counter;

    Military(int power, int max_speed, int mass, String brand, int scope, int takeoff_length, boolean injection, int rockets) {
        super(power, max_speed, mass, brand, scope, takeoff_length);
        this.injection = injection;
        this.rockets = rockets;
    }

    static void showparams(Military m) {
        System.out.print("\n" + "ВОЕННЫЙ САМОЛЕТ" + "\n");
        System.out.println("\n" + "Мощность в л.с. = " + m.power + "\n" + "Максимальная скорость, км/ч = " + m.max_speed + "\n"
                + "Масса, кг = " + m.mass + "\n" + "Марка " + m.brand + "\n" + "Размах крыльев, м  = " + m.scope + "\n" +
                "Длина полосы, м =  " + m.takeoff_length + "\n" + "Катапультирование =  " + m.injection + "\n" + "Количество боеголовок - "
                + m.rockets);
        Transport.kvt(m);
    }

    static void fire(Military m) {
        for (counter = m.rockets - 1; counter >= 0; counter--) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Для выстрела введите любую цифру");
            int x = sc.nextInt();
            System.out.println("Ракета пошла. Осталось " + counter);
        }
        System.out.println("Боезапас исчерпан");
    }

    void inj(Military m) {
        if (m.injection) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("В этом самолете катапультирование не предусмотрено. Усё");
        }
    }
}

