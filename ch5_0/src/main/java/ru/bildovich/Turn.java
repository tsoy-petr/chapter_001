package ru.bildovich;

/**
 * Class Turn
 * bildovich
 * 18.02.2017.
 */
public class Turn {

    /**
     * Метод для инвертирования массива.
     *
     * @param massive перевернутый массив.
     */
    public void back(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }
}
