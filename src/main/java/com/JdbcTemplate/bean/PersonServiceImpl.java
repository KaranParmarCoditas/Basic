package com.JdbcTemplate.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);

    }

    @Override
    public void editPerson(Person person, int person_Id) {
        personDao.editPerson(person, person_Id);

    }

    @Override
    public void deletePerson(int person_Id) {
        personDao.deletePerson(person_Id);

    }

    @Override
    public Person find(int person_Id) {
        return personDao.find(person_Id);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
