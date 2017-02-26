package ru.bildovich;

/**
 * Class BubbleSort.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class MergerTwoArrays {

    /**
     * Метод для слияния двух отсортированных массивов.
     *
     * @param a отсортированные массивы.
     * @param b отсортированные массивы.
     * @return resultArray.
     */
    public static int[] contTwoMass(int[] a, int[] b) {

        int n = a.length;
        int m = b.length;

        int[] result = new int[n + m];

        int i = 0, j = 0;

        int index = 0;

        while (i < n && j < m) {

            if (a[i] < b[j]) {
                result[index] = a[i];
                i++;
            } else {
                result[index] = b[j];
                j++;
            }

            index++;
        }

        while (i < n) {
            result[index] = a[i];
            index++;
            i++;
        }

        while (j < m) {
            result[index] = b[j];
            index++;
            j++;
        }

        return result;

    }
}