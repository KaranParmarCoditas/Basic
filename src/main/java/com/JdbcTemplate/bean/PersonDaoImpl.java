package com.JdbcTemplate.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addPerson(Person person) {
        jdbcTemplate.update("INSERT INTO person (person_id, first_name, Last_name, age) VALUES (?, ?, ?, ?)", person.getPerson_Id(), person.getFirst_name(), person.getLast_name(), person.getRole());
        System.out.println("Person added");
    }

    @Override
    public void editPerson(Person person, int person_Id) {
        jdbcTemplate.update("UPDATE person SET first_name = ? , last_name = ? , age = ? WHERE person_id = ? ", person.getFirst_name(), person.getLast_name(), person.getRole(), person.getPerson_Id());
        System.out.println("Person details updated");
    }

    @Override
    public void deletePerson(int person_Id) {
        jdbcTemplate.update("DELETE from person WHERE person_id=?", person_Id);
        System.out.println("Person Deleted");

    }

    @Override
    public Person find(int person_Id) {
        Person person = (Person) jdbcTemplate.queryForObject("SELECT * from person where person_id =?", new Object[]{person_Id}, new BeanPropertyRowMapper(Person.class));
        return person;
    }

    @Override
    public List<Person> findAll() {
        List<Person> persons = jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper<>(Person.class));
        return persons;
    }
}
