package ru.bildovich;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Class TriangleTest для тестирования.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class TriangleTest {

    /**
     * Тестирование метода area().
     */
    @Test
    public void testForArea() {

        Point a = new Point(2.0, -3.0);
        Point b = new Point(3.0, -2.0);
        Point c = new Point(-2.0, 5.0);

        double result = new Triangle(a, b, c).area();
        double except = 6.0;
        assertThat(result, closeTo(except, 0.000000000000003));
    }

    /**
     * Проверка возможности вычисления площяди треугольника.
     */
    @Test
    public void testExistenceOfATriangle() {

        Point a = new Point(2.0, -3.0);
        Point b = new Point(3.0, -2.0);
        Point c = new Point(-2.0, 5.0);

        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);

        assertThat(false, is((ab + bc <= ac || ab + ac <= bc || ac + bc <= ab)));
    }

    /**
     * Тестирование метода distanceTo(Point point) для класса Point.
     */
    @Test
    public void testForDistanceTo() {

        Point a = new Point(2.0, -3.0);
        Point b = new Point(3.0, -2.0);
        Point c = new Point(-2.0, 5.0);

        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);

        assertThat(ab, is(
                Math.sqrt(((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y)))
        ));

        assertThat(bc, is(
                Math.sqrt(((b.x - c.x) * (b.x - c.x)) + ((b.y - c.y) * (b.y - c.y)))
        ));

        assertThat(ac, is(
                Math.sqrt(((a.x - c.x) * (a.x - c.x)) + ((a.y - c.y) * (a.y - c.y)))
        ));
    }
}