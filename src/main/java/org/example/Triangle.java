package org.example;

public class Triangle implements GeometricFigure {
    float a, b, c;
    String bgColor, borderColor;

    public Triangle(float a, float b, float c, String bgColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Треугольник > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
