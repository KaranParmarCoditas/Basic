package com.JdbcTemplate.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        PersonService personService = (PersonService) context.getBean("personService");

        Person karan = new Person(1, "Karan", "Parmar", "Developer");
        Person sumit = new Person(2, "Sumit", "Badmera", "Developer");
        Person sneha = new Person(3, "Sneha", "Kumari", "Developer");

        personService.addPerson(karan);
        personService.addPerson(sneha);
        personService.addPerson(sumit);

        System.out.println("Find All");

        List<Person> persons = personService.findAll();
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("Delete person ID = 3");
        int deleteMe = 3;
        personService.deletePerson(3);
        personService.deletePerson(deleteMe);

        System.out.println("Update person Id = 1");
        int updateMe = 4;
        personService.editPerson(sumit, updateMe);

        System.out.println("Find person Id = 1");
        Person person = personService.find(1);
        System.out.println(person);

        System.out.println("Find All Again");
        persons = personService.findAll();
        for (Person p : persons) {
            System.out.println(p);

        }
    }
}
