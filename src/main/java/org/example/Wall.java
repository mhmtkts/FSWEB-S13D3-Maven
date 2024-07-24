package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        return this.height = height;
    }

    public double setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        return this.width = width;
    }

    public double getArea() {
        return width * height;
    }
}
