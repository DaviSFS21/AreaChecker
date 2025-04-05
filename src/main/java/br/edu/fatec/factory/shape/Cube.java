package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Cube implements Calculable {
    private double side;

    @Override
    public double calcularArea() {
        return 6 * side * side;
    }
}
