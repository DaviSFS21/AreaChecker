package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Circle implements Calculable {
    private double radius;

    @Override
    public double calcularArea() {
        return Math.PI * radius * radius;
    }
}
