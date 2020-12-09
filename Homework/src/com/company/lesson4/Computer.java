package com.company.lesson4;


import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String processor = "Intel";
    private int ram = 8192;
    private int rom = 1024000;

    private static int recourse = 3;

    void description() {
        System.out.println("Processor " + processor);
        System.out.println("RAM = " + ram);
        System.out.println("ROM = " + rom);
        System.out.println("Resource = " + recourse);
        System.out.println();
    }

    void turnOn() {
        if (recourse <= 0) {
            System.out.println("Ресурс исчерпан");
            System.exit(0);
        } else {
            Random r = new Random();
            Scanner sc = new Scanner(System.in);
            System.out.println("Для включения введите 1 либо 0");
            int z = sc.nextInt();
            int x = r.nextInt(2);

            if (z != x) {
                recourse--;
                System.out.println("Комп сгорел. Остаточный ресурс " + recourse);
                turnOn();
            } else {

                recourse--;
                System.out.println("Комп включился. Остаточный ресурс " + recourse);
            }
        }
    }

    void turnOff() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Для вылючения введите 1 либо 0");
        int z = sc.nextInt();
        int x = r.nextInt(2);

        if (z != x) {
            recourse--;
            System.out.println("Комп сгорел. Остаточный ресурс " + recourse);
            if (recourse <= 0) {
                System.out.println("Компьютер больше не может включиться");
                System.exit(0);
            } else {
                turnOn();
            }
        } else {

            recourse--;
            System.out.println("Комп выключился. Остаточный ресурс " + recourse);
            if (recourse <= 0) {
                System.out.println("Компьютер больше не может включиться");
                System.exit(0);
            } else {
                turnOn();
            }
        }
    }

}
