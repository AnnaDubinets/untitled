package _2024_01_21;

public class HW_4 {

    //-площадь сферы

    public static double calculateArea(double radius) {
        return 4 * 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 2.5;
        double area = calculateArea(radius);
        System.out.println("Площадь сферы:" + area);
    }
}
