package _2024_01_21;

import java.util.Scanner;

public class HW_9 {

    //написать программу, которая принимает в качестве аргумента число.
    //программа должна рассчитать факториал этого числа.
    //
    //написать 3 варианта реализации ('3 метода'):
    //1.используя цикл while
    //2.используя цикл do-while
    //3.используя цикл for
    //
    //Пример факториала числа 5 = 1 * 2 * 3 * 4 * 5 = 120;
    // числа 3 = 1 * 2 * 3  = 6;


    //1.используя цикл while

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        int result = calculateFactorialWhile(number);

        System.out.println("Факториал " + number + " = " + result);
    }
    static int calculateFactorialWhile(int n) {
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }

        return  result;
    }

}
