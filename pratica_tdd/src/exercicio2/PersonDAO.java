package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	
	public void save(Person person){
        System.out.println("Person name: ");
    }

    public List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();

        // Validar o nome
        if (!isValidName(person.getName())) {
            errors.add("O nome deve ser composto por ao menos 2 partes e conter apenas letras");
        }

        // Validar a idade
        if (!isValidAge(person.getAge())) {
            errors.add("A idade deve estar no intervalo [1, 200]");
        }

        // Validar emails
        if (person.getEmails().isEmpty()) {
            errors.add("O objeto Person deve ter pelo menos um objeto da classe Email associado");
        } else {
            for (Email email : person.getEmails()) {
                if (!isValidEmailFormat(email.getName())) {
                    errors.add("O formato do email é inválido");
                    break;
                }
            }
        }

        return errors;
    }

    private boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z]+ [a-zA-Z]+");
    }

    private boolean isValidAge(int age) {
        return age >= 1 && age <= 200;
    }

    private boolean isValidEmailFormat(String email) {
        return email != null && email.matches("\\w+@\\w+\\.\\w+");
    }

}
