package _2024_01_21;

import java.util.Scanner;

public class HW_10 {

    //2.используя цикл do-while

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычесления факториала: ");
        int number = scanner.nextInt();

        int result = calculateFactorialDoWhile(number);

        System.out.println("Факториал " + number + " = " + result);
    }

    static int calculateFactorialDoWhile(int n) {
        int result = 1;
        int i = 1;

        do {
            result *= i;
            i++;
        } while (i <= n);

        return result;
    }
}
