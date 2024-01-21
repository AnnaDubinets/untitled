package _2024_01_18;

import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        getNumbers();
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        getResult(a, b, c);
    }

    //В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
    public static void getNumbers() {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 25) {
                break;
            }
        }

    }

    //Создать программу которая принимает на вход 3 вещественных числа, и будет выводить на экран ТО число, чей остаток от деления на 1.5 -  меньше остальных. Для наглядности выводить и сам остаток.
    public static void getResult(double a, double b, double c) {
        double ostatok1 = a % 1.5;
        double ostatok2 = a % 1.5;
        double ostatok3 = a % 1.5;
        if (ostatok1 < ostatok2 && ostatok1 < ostatok3) {
            System.out.println("Isxodnoe chislo" + a + ", Ostatok" + ostatok1);
        } else if (ostatok2 < ostatok1 && ostatok2 < ostatok3) {
            System.out.println("Isxodnoe chislo" + b + ", Ostatok" + ostatok2);
        } else {
            System.out.println("Isxodnoe chislo" + c + ", Ostatok" + ostatok2);
        }
    }


}
