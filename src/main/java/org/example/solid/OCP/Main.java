package org.example.solid.OCP;

public class Main {
    static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Square square = new Square();
        square.side = 10f;
        calculator.calculateArea(square);
    }
}
