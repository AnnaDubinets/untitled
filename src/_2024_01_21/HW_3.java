package _2024_01_21;

public class HW_3 {

    // -периметр трапеции

    public static double calculatePerimeter(double sideA, double sideB, double base1, double base2) {
        return sideA + sideB + base1 + base2;
    }

    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 5.0;
        double base1 = 4.0;
        double base2 = 6.0;
        double perimeter = calculatePerimeter(sideA, sideB, base1, base2);
        System.out.println("Периметр трапеции:" + perimeter);
    }
}
