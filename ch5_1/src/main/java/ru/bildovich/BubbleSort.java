package ru.bildovich;

/**
 * Class BubbleSort.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class BubbleSort {

    /**
     * Метод для сортировки массива.
     *
     * @param arr отсортированный массив
     */
    public void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
