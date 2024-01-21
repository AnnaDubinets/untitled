package _2024_01_21;

public class HW_1 {


    //площадь треугольника
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 5.0;
        double height = 3.0;
        double area = calculateArea(base, height);
        System.out.println("Площадь треугольника:" + area);

    }
}
