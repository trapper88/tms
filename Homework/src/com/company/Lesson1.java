package com.company;

public class Lesson1 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
    }

    public static void task1() {
        int a = -1;

        if ((a % 10) == a) {
            System.out.println("Число однозначное");
        } else if (a % 100 == a) {
            System.out.println("Число двузначное");
        } else if (a % 1000 == a) {
            System.out.println("Число трехзначное");
        } else if (a % 10000 != 0) {
            System.out.println("Число более трех знаков");
        }
        if (a > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное или 0");
        }

    }

    public static void task2() {

        int a = 20;
        int b = 10;
        int c = 30;

        if (a > b + c) {
            System.out.println("No");
        } else if (b > a + c) {
            System.out.println("No");
        } else if (c > a + b) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    public static void task3() {
        int x = -5;
        if (x > 0) {
            x += 1;
        } else if (x < 0) {
            x -= 2;
        } else {
            x = 10;
        }

        System.out.println(x);


    }

    public static void task4() {
        int a = 1;
        int b = -1;
        int c = 3;

        int x = 0;

        if (a > 0) {
            x++;
        }
        if (b > 0) {
            x++;
        }
        if (c > 0) {
            x++;
        }

        System.out.println(x);
    }

    public static void task5() {
        int a = 1;
        int b = -1;
        int c = 3;

        int x = 0;
        int y = 0;

        if (a > 0) {
            x++;
        }
        if (b > 0) {
            x++;
        }
        if (c > 0) {
            x++;
        }

        if (a < 0) {
            y++;
        }
        if (b < 0) {
            y++;
        }
        if (c < 0) {
            y++;
        }

        System.out.println("Количество положительных чисел " + x);
        System.out.println("Количество отрицательных чисел " + y);

    }

    public static void task6() {
        int a = 2;
        int b = 3;

        if (a > b && a != b) {
            System.out.println(a);
        } else if (b > a && a != b) {
            System.out.println(b);
        }


    }

    public static void task7() {
        int a = 1022;
        if (a >= 11 && a <= 20) {
            System.out.println(a + " программистов");
        } else if (a % 10 >= 2 && a % 10 <= 4) {
            System.out.println(a + " программиста");
        } else if (a % 10 >= 5 || a == 0) {
            System.out.println(a + " программистов");
        } else if (a == 1 || a % 10 == 1) {
            System.out.println(a + " программист");
        }


    }


}
