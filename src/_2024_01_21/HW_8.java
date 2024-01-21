package _2024_01_21;

import java.util.Scanner;

public class HW_8 {

    // площадь сферы:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус сферы: ");
        double sphereRadius = scanner.nextDouble();
        double sphereArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
        System.out.println("Площадь сферы: " + sphereArea);

    }
}
