package com.JdbcTemplate.bean;

import java.util.List;

public interface PersonDao {

    public void addPerson(Person person);

    public void editPerson(Person person, int person_Id);

    public void deletePerson(int person_Id);

    public Person find(int person_Id);

    public List< Person > findAll();
}
