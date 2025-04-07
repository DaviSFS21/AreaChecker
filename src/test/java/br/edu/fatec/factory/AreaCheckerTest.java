package br.edu.fatec.factory;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AreaCheckerTest {

    @Test
    void testCircle() {
        Calculable circle1 = TestUtils.circle(new Double[]{5.0});
        assertThat(circle1.calcularArea()).isEqualTo(Math.PI * 25);

        Calculable circle2 = TestUtils.circle(new Double[]{10.0});
        assertThat(circle2.calcularArea()).isEqualTo(Math.PI * 100);
    }

    @Test
    void testCube() {
        Calculable cube1 = TestUtils.cube(new Double[]{3.0});
        assertThat(cube1.calcularArea()).isEqualTo(54);

        Calculable cube2 = TestUtils.cube(new Double[]{4.0});
        assertThat(cube2.calcularArea()).isEqualTo(96);
    }

    @Test
    void testDiamond() {
        Calculable diamond1 = TestUtils.diamond(new Double[]{4.0, 3.0});
        assertThat(diamond1.calcularArea()).isEqualTo(6);

        Calculable diamond2 = TestUtils.diamond(new Double[]{5.0, 2.0});
        assertThat(diamond2.calcularArea()).isEqualTo(5);
    }

    @Test
    void testHexagon() {
        Calculable hexagon1 = TestUtils.hexagon(new Double[]{2.0});
        assertThat(hexagon1.calcularArea()).isEqualTo(3 * Math.sqrt(3) * 4 / 2);

        Calculable hexagon2 = TestUtils.hexagon(new Double[]{3.0});
        assertThat(hexagon2.calcularArea()).isEqualTo(3 * Math.sqrt(3) * 9 / 2);
    }

    @Test
    void testParallelogram() {
        Calculable parallelogram1 = TestUtils.parallelogram(new Double[]{4.0, 3.0});
        assertThat(parallelogram1.calcularArea()).isEqualTo(12);

        Calculable parallelogram2 = TestUtils.parallelogram(new Double[]{5.0, 2.0});
        assertThat(parallelogram2.calcularArea()).isEqualTo(10);
    }

    @Test
    void testRectangle() {
        Calculable rectangle1 = TestUtils.rectangle(new Double[]{4.0, 3.0});
        assertThat(rectangle1.calcularArea()).isEqualTo(12);

        Calculable rectangle2 = TestUtils.rectangle(new Double[]{5.0, 2.0});
        assertThat(rectangle2.calcularArea()).isEqualTo(10);
    }

    @Test
    void testSquare() {
        Calculable square1 = TestUtils.square(new Double[]{4.0});
        assertThat(square1.calcularArea()).isEqualTo(16);

        Calculable square2 = TestUtils.square(new Double[]{5.0});
        assertThat(square2.calcularArea()).isEqualTo(25);
    }

    @Test
    void testTrapezo() {
        Calculable trapezo1 = TestUtils.trapezo(new Double[]{3.0, 4.0, 2.0});
        assertThat(trapezo1.calcularArea()).isEqualTo(7);

        Calculable trapezo2 = TestUtils.trapezo(new Double[]{5.0, 6.0, 3.0});
        assertThat(trapezo2.calcularArea()).isEqualTo(16.5);
    }

    @Test
    void testTriangle() {
        Calculable triangle1 = TestUtils.triangle(new Double[]{4.0, 3.0});
        assertThat(triangle1.calcularArea()).isEqualTo(6);

        Calculable triangle2 = TestUtils.triangle(new Double[]{5.0, 2.0});
        assertThat(triangle2.calcularArea()).isEqualTo(5);
    }
}
