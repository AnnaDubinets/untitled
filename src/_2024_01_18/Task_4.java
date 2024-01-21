package _2024_01_18;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        String result = getResult(x, y);
        System.out.println(result);

    }

    // Написать программу которая принаем на вход числа X и У в диапазоне от 1 до 3.
    // Посторить логику такими образом, чтобы при вызове вашей программы происходило следующее:
    ////при значении Х равным 2 или 3, выводилось значение Х, а если Х=1, выводить значение Y.
    //Пример: myMethod(x = 3, y = 2) – output: X=3
    //myMethod(x = 2, y = 2) – output: X=2
    //myMethod(x = 1, y = 2) – output: Y=2
    //
    public static String getResult(int x, int y) {
        if (x < 1 || x > y || y < 1 || y > 3) {
            return "Error";
        }
        if (x == 2 || x== 3){
            return "x =" + x;
        } else{
            return "y =" + y;
        }
    }
}

