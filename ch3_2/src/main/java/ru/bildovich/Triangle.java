package ru.bildovich;

public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double area = -1;
        if(area == -1) {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ac = a.distanceTo(c);
            double p = (ab + bc + ac) / 2;
            area = Math.sqrt(p * (p-ab) * (p-bc) * (p-ac));
        }
        return area;
    }
}