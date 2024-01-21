package _2024_01_21;

import java.util.Scanner;

public class HW_7 {

    //-периметр трапеции;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого основания трапеции: ");
        double base1 = scanner.nextDouble();

        System.out.print("Введите длину второго основания трапеции: ");
        double base2 = scanner.nextDouble();

        System.out.print("Введите длину боковой стороны трапеции: ");
        double trapezoidSide = scanner.nextDouble();
        double trapezoidPerimeter = base1 + base2 + 2 * trapezoidSide;

        System.out.println("Периметр трапеции: " + trapezoidPerimeter);
    }
}
