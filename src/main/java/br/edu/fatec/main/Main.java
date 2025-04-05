package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;

public class Main {
    public static void main(String[] args) {
        Calculable circle1 = TestUtils.circle(new Double[]{5.0});
        System.out.println("Circle1 Area: " + circle1.calcularArea() + " (Expected: 78.53981633974483)");

        Calculable circle2 = TestUtils.circle(new Double[]{10.0});
        System.out.println("Circle2 Area: " + circle2.calcularArea() + " (Expected: 314.1592653589793)");

        Calculable cube1 = TestUtils.cube(new Double[]{3.0});
        System.out.println("Cube1 Area: " + cube1.calcularArea() + " (Expected: 54.0)");

        Calculable cube2 = TestUtils.cube(new Double[]{4.0});
        System.out.println("Cube2 Area: " + cube2.calcularArea() + " (Expected: 96.0)");

        Calculable diamond1 = TestUtils.diamond(new Double[]{4.0, 3.0});
        System.out.println("Diamond1 Area: " + diamond1.calcularArea() + " (Expected: 6.0)");

        Calculable diamond2 = TestUtils.diamond(new Double[]{5.0, 2.0});
        System.out.println("Diamond2 Area: " + diamond2.calcularArea() + " (Expected: 5.0)");

        Calculable hexagon1 = TestUtils.hexagon(new Double[]{2.0});
        System.out.println("Hexagon1 Area: " + hexagon1.calcularArea() + " (Expected: 10.392304845413264)");

        Calculable hexagon2 = TestUtils.hexagon(new Double[]{3.0});
        System.out.println("Hexagon2 Area: " + hexagon2.calcularArea() + " (Expected: 23.382685902179844)");

        Calculable parallelogram1 = TestUtils.parallelogram(new Double[]{4.0, 3.0});
        System.out.println("Parallelogram1 Area: " + parallelogram1.calcularArea() + " (Expected: 12.0)");

        Calculable parallelogram2 = TestUtils.parallelogram(new Double[]{5.0, 2.0});
        System.out.println("Parallelogram2 Area: " + parallelogram2.calcularArea() + " (Expected: 10.0)");

        Calculable rectangle1 = TestUtils.rectangle(new Double[]{4.0, 3.0});
        System.out.println("Rectangle1 Area: " + rectangle1.calcularArea() + " (Expected: 12.0)");

        Calculable rectangle2 = TestUtils.rectangle(new Double[]{5.0, 2.0});
        System.out.println("Rectangle2 Area: " + rectangle2.calcularArea() + " (Expected: 10.0)");

        Calculable square1 = TestUtils.square(new Double[]{4.0});
        System.out.println("Square1 Area: " + square1.calcularArea() + " (Expected: 16.0)");

        Calculable square2 = TestUtils.square(new Double[]{5.0});
        System.out.println("Square2 Area: " + square2.calcularArea() + " (Expected: 25.0)");

        Calculable trapezo1 = TestUtils.trapezo(new Double[]{3.0, 4.0, 2.0});
        System.out.println("Trapezo1 Area: " + trapezo1.calcularArea() + " (Expected: 7.0)");

        Calculable trapezo2 = TestUtils.trapezo(new Double[]{5.0, 6.0, 3.0});
        System.out.println("Trapezo2 Area: " + trapezo2.calcularArea() + " (Expected: 16.5)");

        Calculable triangle1 = TestUtils.triangle(new Double[]{4.0, 3.0});
        System.out.println("Triangle1 Area: " + triangle1.calcularArea() + " (Expected: 6.0)");

        Calculable triangle2 = TestUtils.triangle(new Double[]{5.0, 2.0});
        System.out.println("Triangle2 Area: " + triangle2.calcularArea() + " (Expected: 5.0)");
    }
}