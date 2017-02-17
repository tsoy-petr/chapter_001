package ru.bildovich;

/**
 * Class Paint.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class Paint {

    /**
     * Метод выводящий пирамиду из сомволов '*'.
     *
     * @param h высота пирамиды
     * @return строка содержащая пирамиду
     */
    public String piramid(int h) {
        StringBuilder sb = new StringBuilder();
        h = h * 2;
        if (h % 2 == 0) {
            h++;
        }
        for (int i = 0; i < h; i += 2) {
            for (int j = 0; j < (h - 1) / 2 - (i / 2); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                sb.append('*');
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
