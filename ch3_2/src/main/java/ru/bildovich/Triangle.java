package ru.bildovich;

/**
 * Class Triangle.
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class Triangle {

    /**
     * переменная a.
     */
    private Point a;
    /**
     * переменная b.
     */
    private Point b;
    /**
     * переменная c.
     */
    private Point c;

    /**
     * Конструктор с параметрами.
     *
     * @param a точка
     * @param b точка
     * @param c точка
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисляющий площадь треугольника.
     *
     * @return area площадь треугольника
     */
    public double area() {
        double area = -1;
        if (area == -1) {
            double ab = this.a.distanceTo(b);
            double bc = this.b.distanceTo(c);
            double ac = this.a.distanceTo(c);
            double p = (ab + bc + ac) / 2;
            area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return area;
    }
}