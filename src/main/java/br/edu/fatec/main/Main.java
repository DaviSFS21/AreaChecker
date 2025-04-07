package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.impl.ShapeFactoryImpl;
import br.edu.fatec.factory.shape.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();

        Calculable circle1 = shapeFactory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        System.out.printf("Circle1 Area: %.2f (Expected: 78.54)%n", circle1.calcularArea());

        Calculable circle2 = shapeFactory.getShape(ShapeType.CIRCLE, new Double[]{10.0});
        System.out.printf("Circle2 Area: %.2f (Expected: 314.16)%n", circle2.calcularArea());

        Calculable cube1 = shapeFactory.getShape(ShapeType.CUBE, new Double[]{3.0});
        System.out.printf("Cube1 Area: %.2f (Expected: 54.00)%n", cube1.calcularArea());

        Calculable cube2 = shapeFactory.getShape(ShapeType.CUBE, new Double[]{4.0});
        System.out.printf("Cube2 Area: %.2f (Expected: 96.00)%n", cube2.calcularArea());

        Calculable diamond1 = shapeFactory.getShape(ShapeType.DIAMOND, new Double[]{4.0, 3.0});
        System.out.printf("Diamond1 Area: %.2f (Expected: 6.00)%n", diamond1.calcularArea());

        Calculable diamond2 = shapeFactory.getShape(ShapeType.DIAMOND, new Double[]{5.0, 2.0});
        System.out.printf("Diamond2 Area: %.2f (Expected: 5.00)%n", diamond2.calcularArea());

        Calculable hexagon1 = shapeFactory.getShape(ShapeType.HEXAGON, new Double[]{2.0});
        System.out.printf("Hexagon1 Area: %.2f (Expected: 10.39)%n", hexagon1.calcularArea());

        Calculable hexagon2 = shapeFactory.getShape(ShapeType.HEXAGON, new Double[]{3.0});
        System.out.printf("Hexagon2 Area: %.2f (Expected: 23.38)%n", hexagon2.calcularArea());

        Calculable parallelogram1 = shapeFactory.getShape(ShapeType.PARALLELOGRAM, new Double[]{4.0, 3.0});
        System.out.printf("Parallelogram1 Area: %.2f (Expected: 12.00)%n", parallelogram1.calcularArea());

        Calculable parallelogram2 = shapeFactory.getShape(ShapeType.PARALLELOGRAM, new Double[]{5.0, 2.0});
        System.out.printf("Parallelogram2 Area: %.2f (Expected: 10.00)%n", parallelogram2.calcularArea());

        Calculable rectangle1 = shapeFactory.getShape(ShapeType.RECTANGLE, new Double[]{4.0, 3.0});
        System.out.printf("Rectangle1 Area: %.2f (Expected: 12.00)%n", rectangle1.calcularArea());

        Calculable rectangle2 = shapeFactory.getShape(ShapeType.RECTANGLE, new Double[]{5.0, 2.0});
        System.out.printf("Rectangle2 Area: %.2f (Expected: 10.00)%n", rectangle2.calcularArea());

        Calculable square1 = shapeFactory.getShape(ShapeType.SQUARE, new Double[]{4.0});
        System.out.printf("Square1 Area: %.2f (Expected: 16.00)%n", square1.calcularArea());

        Calculable square2 = shapeFactory.getShape(ShapeType.SQUARE, new Double[]{5.0});
        System.out.printf("Square2 Area: %.2f (Expected: 25.00)%n", square2.calcularArea());

        Calculable trapezo1 = shapeFactory.getShape(ShapeType.TRAPEZO, new Double[]{3.0, 4.0, 2.0});
        System.out.printf("Trapezo1 Area: %.2f (Expected: 7.00)%n", trapezo1.calcularArea());

        Calculable trapezo2 = shapeFactory.getShape(ShapeType.TRAPEZO, new Double[]{5.0, 6.0, 3.0});
        System.out.printf("Trapezo2 Area: %.2f (Expected: 16.50)%n", trapezo2.calcularArea());

        Calculable triangle1 = shapeFactory.getShape(ShapeType.TRIANGLE, new Double[]{4.0, 3.0});
        System.out.printf("Triangle1 Area: %.2f (Expected: 6.00)%n", triangle1.calcularArea());

        Calculable triangle2 = shapeFactory.getShape(ShapeType.TRIANGLE, new Double[]{5.0, 2.0});
        System.out.printf("Triangle2 Area: %.2f (Expected: 5.00)%n", triangle2.calcularArea());
    }
}