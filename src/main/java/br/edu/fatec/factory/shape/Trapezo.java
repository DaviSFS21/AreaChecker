package br.edu.fatec.factory.shape;

import br.edu.fatec.factory.Calculable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Trapezo implements Calculable {
    private double baseA;
    private double baseB;
    private double height;

    @Override
    public double calcularArea() {
        return (baseA + baseB) / 2 * height;
    }
}
