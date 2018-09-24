/**
 * Java. Level 1. Lesson 4. Homework
 *
 * @author Philipp Vlasov
 * @version dated Sep 24, 2018
 */


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }
/* Здесь изменил метод checkWin
Переделать проверку победы, чтобы она не была реализована просто набором условий,
например, с использованием циклов.
 */

    boolean checkWin(char dot) {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int horizont = 0;
            int vertical = 0;
            if (map[i][SIZE - 1 - i] == dot) {
                diag2++;
            }
            if (map[i][i] == dot) {
                diag1++;
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == dot) {
                        horizont++;
                    }
                    if (map[j][i] == dot) {
                        vertical++;
                    }
                }
            }
            if (horizont == SIZE || vertical == SIZE || diag1 == SIZE || diag2 == SIZE) {
                return true;
            }
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[x][y] == DOT_EMPTY;
    }
}
