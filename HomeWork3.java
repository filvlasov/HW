/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Philipp Vlasov
 * @version dated Sep 21, 2018
 */

import java.util.Scanner;
import java.util.Random;

public class HomeWork3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // task 1
        catchNumber();
    }
    /**
     * Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
     * попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
     * указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
     * выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void catchNumber() {
        Random rand = new Random();
        int d = getNumberFromScanner("For play push 1. For exit push 0", 0, 1);
        while (d == 1) {
            int​​ diller = rand.nextInt(10);
            int i;
            for (i = 0; i < 3; i++) {
                System.out.println("Try to guess the number from 0 to 9.");
                int player = sc.nextInt();
                if (player < diller) {
                    System.out.println("Your number is smaller. You have " + (2 - i) + " attemps.");
                } else if (player > diller) {
                    System.out.println("Your number is bigger. You have " + (2 - i) + " attemps.");
                } else {
                    System.out.println("You win!!!");
                    i = 10;
                }
            }
            if (i < 10) {
                System.out.println("You lose.");
            }
            d = getNumberFromScanner("For play push 1. For exit push 0", 0, 1);
        }
    }
    // Используется в методе catchNumber()
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x != min && x != max);
        return x;
    }
}
