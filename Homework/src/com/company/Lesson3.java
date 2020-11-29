package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson3 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }

        int[] array = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void task2() {

        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) a++;
        }

        int z[] = new int[a];
        for (int i = 1, b = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                z[b] = i;
            } else {
                continue;
            }
            System.out.print(z[b] + " ");
            b++;
        }
        System.out.println(" ");
        for (int i = 100, b = 0; i >= 1; i--) {
            if (i % 2 != 0) {
                z[b] = i;
            } else {
                continue;
            }
            System.out.print(z[b] + " ");
            b++;
        }
    }

    public static void task3() {
        System.out.println();
        int x = 0;
        int[] z = new int[15];
        for (int i = 0; i < z.length; i++) {
            Random r = new Random();
            z[i] = r.nextInt(99);
            System.out.print(z[i] + " ");
            if (z[i] != 0 && z[i] % 2 == 0) x++;
        }
        System.out.println(" ");
        System.out.println("Четных " + x);

    }

    public static void task4() {
        int[] z = new int[20];
        for (int i = 0; i < z.length; i++) {
            Random r = new Random();
            z[i] = r.nextInt(20);
            System.out.print(z[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < z.length; i++) {
            if (i % 2 != 0) z[i] = 0;
            System.out.print(z[i] + " ");
        }
    }

    public static void task5() {
        System.out.println();
        int[] z1 = new int[5];
        int[] z2 = new int[5];

        for (int i = 0; i < z1.length; i++) {
            Random r1 = new Random();
            z1[i] = r1.nextInt(15);
            System.out.print(z1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < z2.length; i++) {
            Random r2 = new Random();
            z2[i] = r2.nextInt(15);
            System.out.print(z2[i] + " ");

        }
        System.out.println("");

        int a1 = 0;
        int a2 = 0;

        for (int i = 0; i < z1.length; i++) {
            a1 += z1[i];
            a2 += z2[i];
        }
        a1 /= 5;
        a2 /= 5;

        if (a1 > a2) System.out.println("Первый больше");
        if (a1 < a2) System.out.println("Второй больше");
        if (a1 == a2) System.out.println("Равны");

    }

    public static void task6() {

        int[] z = new int[4];

        for (int i = 0; i < z.length; i++) {

            Random r = new Random();
            z[i] = r.nextInt(10);
            System.out.print(z[i] + " ");
        }
        System.out.println("");

        boolean vozr = true;

        for (int i = 1; i < z.length; i++) {
            if (z[i] <= z[i - 1]) {
                vozr = false;
                break;
            }

        }
        if (vozr) System.out.println("Возрастающая последовательность");
        else {
            System.out.println("Нет");
            task6();
        }
    }

    public static void task7() {

        int[] array = new int[12];
        Random x = new Random();
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(15);
            if (array[i] > y) {
                y = array[i];
            }
        }

        for (int j = array.length; ; j--) {
            if (array[j - 1] == y) {
                j--;
                System.out.println("Индекс максимального числа массива " + y + " равен " + j);
                break;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}




