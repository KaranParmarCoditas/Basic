package com.JdbcTemplate.bean;

import java.util.List;

public interface PersonService {

    public void addPerson(Person person);

    public void editPerson(Person person, int person_Id);

    public void deletePerson(int person_Id);

    public Person find(int personId);

    public List< Person > findAll();
}
