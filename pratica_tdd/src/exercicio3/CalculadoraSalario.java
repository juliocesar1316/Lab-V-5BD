package exercicio3;

public class CalculadoraSalario {

	public static double calculaSalarioLiquido(Funcionario funcionario) {
		double salarioBase = funcionario.getSalarioBase();
		double desconto = 0.0;
		
		if (salarioBase <= 0) {
			throw new IllegalArgumentException("Salário base deve ser maior que zero");
		}
		
		switch (funcionario.getCargo()) {
		case DESENVOLVEDOR:
			desconto = (salarioBase >= 3000.00) ? 0.20 : 0.10;
			break;
		case DBA:
			desconto = (salarioBase >= 2000.00) ? 0.25 : 0.15;
			break;
		case TESTADOR:
			desconto = (salarioBase >= 2000.00) ? 0.25 : 0.15;
			break;
		case GERENTE:
			desconto = (salarioBase >= 5000.00) ? 0.30 : 0.20;
			break;
		default:
			throw new IllegalArgumentException("Cargo desconhecido");
		}
		
		return salarioBase - (salarioBase * desconto);
	}
}