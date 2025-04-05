package br.edu.fatec.factory.impl;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.shape.Circle;
import br.edu.fatec.factory.shape.Cube;
import br.edu.fatec.factory.shape.Diamond;
import br.edu.fatec.factory.shape.Hexagon;
import br.edu.fatec.factory.shape.Parallelogram;
import br.edu.fatec.factory.shape.Rectangle;
import br.edu.fatec.factory.shape.ShapeType;
import br.edu.fatec.factory.shape.Square;
import br.edu.fatec.factory.shape.Trapezo;
import br.edu.fatec.factory.shape.Triangle;

public class ShapeFactoryImpl implements ShapeFactory {
    public Calculable getShape(ShapeType type, Double[] values) {
        return switch (type) {
            case SQUARE -> new Square(values[0]);
            case RECTANGLE -> new Rectangle(values[0], values[1]);
            case CIRCLE -> new Circle(values[0]);
            case TRIANGLE -> new Triangle(values[0], values[1]);
            case PARALLELOGRAM -> new Parallelogram(values[0], values[1]);
            case TRAPEZO -> new Trapezo(values[0], values[1], values[2]);
            case HEXAGON -> new Hexagon(values[0]);
            case DIAMOND -> new Diamond(values[0], values[1]);
            case CUBE -> new Cube(values[0]);
        };
    }
}
