package _2024_01_21;

public class HW_2 {

    //-объём куба

    public static double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    public static void main(String[] args) {
        double sideLength = 4.0;
        double volume = calculateVolume(sideLength);
        System.out.println("Объем куба:" + volume);

    }
}
