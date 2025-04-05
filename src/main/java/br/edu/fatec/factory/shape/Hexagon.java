package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Hexagon implements Calculable {
    private double side;

    @Override
    public double calcularArea() {
        return ((3 * Math.sqrt(3)) / 2) * (side * side);
    }
}
