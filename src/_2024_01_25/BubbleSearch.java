package _2024_01_25;

import java.util.Arrays;

public class BubbleSearch {
    public static void main(String[] args) {
        int[] array = {22, 3, 4, 2, 50};
        bubbleSearch(array);
        System.out.println(Arrays.toString(array));
    }


    private static void bubbleSearch(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
