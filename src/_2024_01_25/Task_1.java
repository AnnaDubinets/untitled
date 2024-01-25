package _2024_01_25;

public class Task_1 {
    public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            //Сортировка по возрастанию
        ascendingSort(array);
        //Вывод отсортированного числа
        System.out.println("Отсортированный по возрастанию: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        //Сортировка по убыванию
        descandingSort(array);

        System.out.println("Отсортированный по убыванию: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void ascendingSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Поменять местами элементы, если текущий больше следующего
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public static void descandingSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
