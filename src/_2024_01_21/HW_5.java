package _2024_01_21;

import java.util.Scanner;

public class HW_5 {

    //Написать математические формулы, в отдельных классах используя Мейн метод:
    //-площадь треугольника;
    //-объём куба;
    //-периметр трапеции;
    //-площадь сферы.
    //Переделать так что бы все значения вводились с помощью сканнера

    //-площадь треугольника;

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание треугольника:");
        double base = scanner.nextDouble();

        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();

        double area = calculateArea(base, height);
        System.out.println("Площадь треугольника: " + area);
    }
}
