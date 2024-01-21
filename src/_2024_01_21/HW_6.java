package _2024_01_21;

import java.util.Scanner;

public class HW_6 {

    //-объём куба;

    public static double calculateVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны куба:");
        double sideLength = scanner.nextDouble();

        double volume = calculateVolume(sideLength);
        System.out.println("Объем куба: " + volume);
    }
}
