package exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PersonDAOTest {

	@Test
    public void testIsValidToInclude_ValidPerson() {
        // Criando uma pessoa válida
        Person person = new Person("John Doe", 30, 1);
        person.addEmail(new Email(1, "john@example.com"));

        // Criando um PersonDAO
        PersonDAO personDAO = new PersonDAO();

        // Executando o método isValidToInclude()
        List<String> errors = personDAO.isValidToInclude(person);

        // Verificando se não há erros
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testIsValidToInclude_InvalidName() {
        // Criando uma pessoa com nome inválido
        Person person = new Person("John", 30, 1);
        person.addEmail(new Email(1, "john@example.com"));

        // Criando um PersonDAO
        PersonDAO personDAO = new PersonDAO();

        // Executando o método isValidToInclude()
        List<String> errors = personDAO.isValidToInclude(person);

        // Verificando se há erro relacionado ao nome inválido
        assertFalse(errors.isEmpty());
        assertEquals("O nome deve ser composto por ao menos 2 partes e conter apenas letras", errors.get(0));
    }

    @Test
    public void testIsValidToInclude_InvalidAge() {
        // Criando uma pessoa com idade inválida
        Person person = new Person("John Doe", 0, 1);
        person.addEmail(new Email(1, "john@example.com"));

        // Criando um PersonDAO
        PersonDAO personDAO = new PersonDAO();

        // Executando o método isValidToInclude()
        List<String> errors = personDAO.isValidToInclude(person);

        // Verificando se há erro relacionado à idade inválida
        assertFalse(errors.isEmpty());
        assertEquals("A idade deve estar no intervalo [1, 200]", errors.get(0));
    }

    @Test
    public void testIsValidToInclude_NoEmail() {
        // Criando uma pessoa sem email
        Person person = new Person("John Doe", 30, 1);

        // Criando um PersonDAO
        PersonDAO personDAO = new PersonDAO();

        // Executando o método isValidToInclude()
        List<String> errors = personDAO.isValidToInclude(person);

        // Verificando se há erro relacionado à ausência de email
        assertFalse(errors.isEmpty());
        assertEquals("O objeto Person deve ter pelo menos um objeto da classe Email associado", errors.get(0));
    }

    @Test
    public void testIsValidToInclude_InvalidEmailFormat() {
        // Criando uma pessoa com email inválido
        Person person = new Person("John Doe", 30, 1);
        person.addEmail(new Email(1, "invalid-email-format"));

        // Criando um PersonDAO
        PersonDAO personDAO = new PersonDAO();

        // Executando o método isValidToInclude()
        List<String> errors = personDAO.isValidToInclude(person);

        // Verificando se há erro relacionado ao formato inválido de email
        assertFalse(errors.isEmpty());
        assertEquals("O formato do email é inválido", errors.get(0));
    }
}
