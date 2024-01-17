package _2024_01_16;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        byte a = 100; //1 байт (-128 до 127)
        short s = 500; //2 байта (-30 000 до + 30 000)
        int w = 1100000; // 4 байта (-2 000 000 000 до + 2 000 000 000)
        long l = 3000000000L; // 8 байт (-9 10^18 до +9 10^18)

        float f = 1235000.123f; //4 байта
        double g = 123000000000000.123; //8 байт

        System.out.println(f);
        System.out.println(g);
        System.out.println(a % 3);

        System.out.println(s >= a);

        char c = '1'; //2 байта

        boolean bool = false; //1 байт


        while (g <= a) {
            System.out.println("!!!!!!!!!");
            g = g + 1;
        }

        // Вывести на экран числа от 0 до 100

        int step = 0;

        while (step <= 100) {
            System.out.print(step + ", ");
            step = step + 1;
        }

        System.out.println();

        System.out.println("1111111");
    }

}





