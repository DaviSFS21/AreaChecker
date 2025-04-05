package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Diamond implements Calculable {
    private double diagonal1;
    private double diagonal2;

    @Override
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
