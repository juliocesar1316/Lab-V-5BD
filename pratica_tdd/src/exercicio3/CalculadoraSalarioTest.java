package exercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraSalarioTest {

        @Test
        public void testDesenvolvedorSalarioAlto() {
            Funcionario desenvolvedor = new Funcionario("Desenvolvedor", "dev@example.com", 3000.00, Cargo.DESENVOLVEDOR);
            assertEquals(2400.00, CalculadoraSalario.calculaSalarioLiquido(desenvolvedor));
        }

        @Test
        public void testDesenvolvedorSalarioBaixo() {
            Funcionario desenvolvedor = new Funcionario("Desenvolvedor", "dev@example.com", 2500.00, Cargo.DESENVOLVEDOR);
            assertEquals(2250.00, CalculadoraSalario.calculaSalarioLiquido(desenvolvedor));
        }

        @Test
        public void testDBASalarioAlto() {
            Funcionario dba = new Funcionario("DBA", "dba@example.com", 2000.00, Cargo.DBA);
            assertEquals(1500.00, CalculadoraSalario.calculaSalarioLiquido(dba));
        }

        @Test
        public void testDBASalarioBaixo() {
            Funcionario dba = new Funcionario("DBA", "dba@example.com", 1800.00, Cargo.DBA);
            assertEquals(1530.00, CalculadoraSalario.calculaSalarioLiquido(dba));
        }

        @Test
        public void testTestadorSalarioAlto() {
            Funcionario testador = new Funcionario("Testador", "test@example.com", 2000.00, Cargo.TESTADOR);
            assertEquals(1500.00, CalculadoraSalario.calculaSalarioLiquido(testador));
        }

        @Test
        public void testTestadorSalarioBaixo() {
            Funcionario testador = new Funcionario("Testador", "test@example.com", 1800.00, Cargo.TESTADOR);
            assertEquals(1530.00, CalculadoraSalario.calculaSalarioLiquido(testador));
        }

        @Test
        public void testGerenteSalarioAlto() {
            Funcionario gerente = new Funcionario("Gerente", "ger@example.com", 5000.00, Cargo.GERENTE);
            assertEquals(3500.00, CalculadoraSalario.calculaSalarioLiquido(gerente));
        }

        @Test
        public void testGerenteSalarioBaixo() {
            Funcionario gerente = new Funcionario("Gerente", "ger@example.com", 4500.00, Cargo.GERENTE);
            assertEquals(3600.00, CalculadoraSalario.calculaSalarioLiquido(gerente));
        }
    
    @Test
    public void testSalarioZero() {
        Funcionario funcionarioZero = new Funcionario("Func Zero", "zero@example.com", 0.00, Cargo.DESENVOLVEDOR);
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraSalario.calculaSalarioLiquido(funcionarioZero);
        });
    }

    @Test
    public void testSalarioNegativo() {
        Funcionario funcionarioNegativo = new Funcionario("Func Negativo", "negativo@example.com", -100.00, Cargo.DESENVOLVEDOR);
        assertThrows(IllegalArgumentException.class, () -> {
        	CalculadoraSalario.calculaSalarioLiquido(funcionarioNegativo);
        });
    }
    
}
