package org.example;

public class Rectangle implements GeometricFigure {
    float a, b;
    String bgColor, borderColor;

    public Rectangle(float a, float b, String bgColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Прямоугольник > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    public double getPerimeter() {
        return (a + b) * 2;
    }

    public double getArea() {
        return a * b;
    }
}
