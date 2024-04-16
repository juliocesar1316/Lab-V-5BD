package exercicio3;

public class mainClass {
	
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "joao@email.com", 2000.00, Cargo.DESENVOLVEDOR);
        double salarioLiquido = CalculadoraSalario.calculaSalarioLiquido(funcionario);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Salário-Base: " + funcionario.getSalarioBase());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}