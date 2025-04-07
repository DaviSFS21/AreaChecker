package br.edu.fatec.factory;

import br.edu.fatec.factory.impl.ShapeFactoryImpl;
import br.edu.fatec.factory.shape.ShapeType;

public class TestUtils {
    static ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();

    public static Calculable circle(Double[] values) {
        return shapeFactory.getShape(ShapeType.CIRCLE, values);
    }

    public static Calculable cube(Double[] values) {
        return shapeFactory.getShape(ShapeType.CUBE, values);
    }

    public static Calculable diamond(Double[] values) {
        return shapeFactory.getShape(ShapeType.DIAMOND, values);
    }

    public static Calculable hexagon(Double[] values) {
        return shapeFactory.getShape(ShapeType.HEXAGON, values);
    }

    public static Calculable parallelogram(Double[] values) {
        return shapeFactory.getShape(ShapeType.PARALLELOGRAM, values);
    }

    public static Calculable rectangle(Double[] values) {
        return shapeFactory.getShape(ShapeType.RECTANGLE, values);
    }

    public static Calculable square(Double[] values) {
        return shapeFactory.getShape(ShapeType.SQUARE, values);
    }

    public static Calculable trapezo(Double[] values) {
        return shapeFactory.getShape(ShapeType.TRAPEZO, values);
    }

    public static Calculable triangle(Double[] values) {
        return shapeFactory.getShape(ShapeType.TRIANGLE, values);
    }
}
