package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private int id;
    private String name;
    private int age;
    private List<Email> emails;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        if (emails == null) {
            emails = new ArrayList<>();
        }
        emails.add(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Email> getEmails() {
        return emails;
    }

}
