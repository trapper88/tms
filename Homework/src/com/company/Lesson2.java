package com.company;

public class Lesson2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        double s = 10;
        int d = 1;

        while (d != 7) {
            s *= 1.1;
            d++;
        }
        System.out.println(s);

    }

    public static void task2() {

        int a = 0;
        int b = 1;

        do {
            a += 3;
            b *= 2;
            System.out.println("Через " + a + " - " + b);
        }
        while (a < 24);
    }

    public static void task3() {
        int a = 1;
        int b = 0;
        while (a <= 256) {
            b = b + a;
            a *= 2;
        }
        System.out.println(b);
    }

    public static void task4() {

        int x = 33;
        int y = 5;
        int sum = 0;

        for (int a = 0; a != x; a++) {
            sum += y;
        }
        System.out.println(sum);
    }

    public static void task5() {
        double b = 0;
        int a = 0;
        while (a < 20) {
            a++;
            b = 2.54 * a;

            System.out.println(a + " inch = " + b + " sm");
        }
    }

    public static void task6() {

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void task7() {
        int a = 1;
        int b = 0;
        while (a <= 99) {
            if (a % 2 != 0) {
                b = b + a;
            }
            a++;
        }
        System.out.println(b);
    }

    public static void task8() {
        for (int y = 1; y <= 4; y++) {
            for (int x = 1; x <= y; System.out.print("* ")) {
                x++;
            }
            System.out.println();
        }
        System.out.println();
        for (int y = 1; y <= 4; y++) {
            for (int x = 4; x >= y; System.out.print("* ")) {
                x--;
            }
            System.out.println();
        }
    }
}

