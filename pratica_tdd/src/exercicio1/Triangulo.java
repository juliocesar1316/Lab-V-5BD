package exercicio1;

public class Triangulo {
	
	private Integer ladoA;
	private Integer ladoB;
	private Integer ladoC;
	
	public String verificaTriangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            return "Valores inválidos";
        }
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            return "Não é um triângulo";
        }
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

	public Integer getLadoA() {
		return ladoA;
	}

	public void setLadoA(Integer ladoA) {
		this.ladoA = ladoA;
	}

	public Integer getLadoB() {
		return ladoB;
	}

	public void setLadoB(Integer ladoB) {
		this.ladoB = ladoB;
	}

	public Integer getLadoC() {
		return ladoC;
	}

	public void setLadoC(Integer ladoC) {
		this.ladoC = ladoC;
	}
	
	

}
