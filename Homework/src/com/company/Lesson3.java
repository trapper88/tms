package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        multiarray1();
//        multiarray2();
//        multiarray3();
//        multiarray4();
        multiarray5();

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

    public static void task8() {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] sum = new double[10];
        Random x = new Random();
        Random y = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = x.nextInt(9);
            arr2[i] = y.nextInt(9);
            sum[i] = (double) arr1[i] / arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sum));
        int z = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] % 1 == 0 && sum[i] != 0) {
                z++;
            }
        }
        System.out.println("Количество целых " + z);
    }

    public static void task9() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int y = sc.nextInt();
        if (y <= 0) {
            System.out.println("Incorrect number");
            return;
        }
        Random r = new Random();

        int[] arr = new int[y];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));
        int sum1 = 0;
        int sum2 = 0;
        double p = Math.floor(arr.length / 2);

        for (int i = 0; i < p; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length - 1; i > p; i--) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Left bigger");
            if (sum1 < sum2) {
                System.out.println("Right bigger");
            }
        } else {
            System.out.println("Equals");


        }
    }

    public static void task10() {
        System.out.println("Enter number > 3");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 3) {
            System.out.println("Wrong number");
            return;
        }
        int[] arr = new int[x];
        int pol = 0;
        for (int i = 0; i < arr.length; i++) {

            Random r = new Random();
            arr[i] = r.nextInt(x);
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                pol++;
            }
        }
        System.out.println(Arrays.toString(arr));

        int arr2[] = new int[pol];
        int u = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0 && arr[j] != 0) {
                arr2[u] = arr[j];
                u++;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }

    public static void multiarray1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через Enter - размеры матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            System.out.println("Числа не равны");
            multiarray1();
        }

        int[][] marr = new int[x][y];
        Random r = new Random();
        int z = 0;
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = r.nextInt(50);
                if (i == j && marr[i][j] % 2 == 0) {
                    z += marr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(marr));
        System.out.println(z);
    }

    public static void multiarray2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через Enter - размеры матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            System.out.println("Числа не равны");
            multiarray2();
        }

        int[][] marr = new int[x][y];
        Random r = new Random();

        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = r.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(marr));
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (marr[i][j] % 2 != 0) {
                    System.out.print(marr[i][j] + " ");
                }
            }
        }

    }

    public static void multiarray3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 одинаковых числа через Enter - размеры матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            System.out.println("Числа не равны");
            multiarray3();
        }
        int[][] marr = new int[x][y];
        Random r = new Random();
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = r.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(marr));
        int w = 1;
        int e = 1;
        for (int i = 0; i < marr.length; i++) {
            w *= marr[i][i];
            e *= marr[i][marr.length - 1 - i];
        }
        System.out.println(w + " " + e);
        if (w > e) {
            System.out.println("На главной диагонали произведение больше");
        } else {
            System.out.println("Произведение на побочной диагонали больше или они равны");
        }

    }

    public static void multiarray4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 одинаковых числа через Enter - размеры матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            System.out.println("Числа не равны");
            multiarray4();
        }
        int[][] marr = new int[x][y];
        Random r = new Random();
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = r.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(marr));
        int z = 0;
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr.length - i - 1; j++) {
                if (marr[i][j] % 2 == 0) {
                    z += marr[i][j];
                }
            }
        }
        System.out.println(z);
    }

    public static void multiarray5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 одинаковых числа через Enter - размеры матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            System.out.println("Числа не равны");
            multiarray5();
        }
        int[][] marr = new int[x][y];
        Random r = new Random();
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                marr[i][j] = r.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(marr));

        for (int i = 0; i < marr.length; i++) {
            for (int j = i + 1; j < marr.length; j++) {
                int temp = marr[i][j];
                marr[i][j] = marr[j][i];
                marr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(marr));

    }


}









