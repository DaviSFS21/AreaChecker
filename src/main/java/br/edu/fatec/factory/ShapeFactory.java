package br.edu.fatec.factory;

import br.edu.fatec.factory.shape.ShapeType;

public interface ShapeFactory {
    Calculable getShape(ShapeType type, Double[] values);
}
