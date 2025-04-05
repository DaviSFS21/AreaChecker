package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Parallelogram implements Calculable {
    private double base;
    private double height;

    @Override
    public double calcularArea() {
        return base * height;
    }
}
