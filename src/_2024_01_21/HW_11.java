package _2024_01_21;

import java.util.Scanner;

public class HW_11 {

    //3.используя цикл for

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        int result = calculateFactorialFor(number);

        System.out.println("Факториал " + number + " = " + result);
    }

    static int calculateFactorialFor(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
