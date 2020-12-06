package com.company.tictaclesson3;

import java.util.Random;
import java.util.Scanner;

public class TicTac {

    final char X = 'X';
    final char O = 'O';
    final char empty = '*';
    char[][] table;
    Random random;
    Scanner scanner;

    public TicTac() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }



    void initTable() {
        for (int i = 0; i < 3; i++){
            for (int j= 0; j < 3; j++){
                table[i][j] = empty;
                System.out.print(table[i][j] + " ");}
            System.out.println();
    }

    }


    void printTable() {
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return table[y][x] == empty;
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = O;
    }
    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(X)){
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }
    boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }
    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == empty)
                    return false;
        return true;
    }

}