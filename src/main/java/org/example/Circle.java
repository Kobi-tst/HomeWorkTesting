package org.example;

public class Circle implements GeometricFigure {
    float r;
    String bgColor, borderColor;

    public Circle(float r, String bgColor, String borderColor) {
        this.r = r;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Круг > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}