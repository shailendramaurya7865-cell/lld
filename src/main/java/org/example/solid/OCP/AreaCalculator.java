package org.example.solid.OCP;

public class AreaCalculator {

    public double calculateArea(Shape shape) {
        double area = 0;
        if(shape instanceof Circle) {
            Circle circle = (Circle) shape;
            double radius = circle.radius;
            area = 3.14 * radius * radius;
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            double side = square.side;
            area = side * side;
        }
        return area;
    }
}
