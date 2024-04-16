package exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianguloTest {

	private final Triangulo triangulo = new Triangulo();

    @Test
    public void testEscalenoValido() {
        assertEquals("Escaleno", triangulo.verificaTriangulo(2, 3, 4));
    }

    @Test
    public void testIsoscelesValido() {
        assertEquals("Isósceles", triangulo.verificaTriangulo(2, 2, 3));
    }

    @Test
    public void testEquilateroValido() {
        assertEquals("Equilátero", triangulo.verificaTriangulo(2, 2, 2));
    }

    @Test
    public void testPermutacoesIsosceles() {
        assertEquals("Isósceles", triangulo.verificaTriangulo(3, 3, 2));
        assertEquals("Isósceles", triangulo.verificaTriangulo(3, 2, 3));
        assertEquals("Isósceles", triangulo.verificaTriangulo(2, 3, 3));
    }

    @Test
    public void testValorZero() {
        assertEquals("Valores inválidos", triangulo.verificaTriangulo(0, 1, 2));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Valores inválidos", triangulo.verificaTriangulo(-1, 2, 3));
    }

    @Test
    public void testSomaIgualTerceiroLado() {
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(1, 2, 3));
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(3, 1, 2));
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(2, 3, 1));
    }

    @Test
    public void testSomaMenorQueTerceiroLado() {
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(1, 2, 4));
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(4, 1, 2));
        assertEquals("Não é um triângulo", triangulo.verificaTriangulo(1, 4, 2));
    }

    @Test
    public void testTodosValoresZero() {
        assertEquals("Valores inválidos", triangulo.verificaTriangulo(0, 0, 0));
    }

}
