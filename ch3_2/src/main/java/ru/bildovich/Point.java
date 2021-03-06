package ru.bildovich;

/**
 * Class Point.
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class Point {
    /**
     * координата x.
     */
    private double x;
    /**
     * координата y.
     */
    private double y;

    /**
     * Конструктор с параметрами.
     * @param x координата
     * @param y координата
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод определяющий расстояние между точками.
     * @param point вторая точка
     * @return  возвращает расстояние double
     */
    public double distanceTo(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Get.
     * @return var x
     */
    public double getX() {
        return x;
    }

    /**
     * Get.
     * @return var y
     */
    public double getY() {
        return y;
    }
}

