package com.JdbcTemplate.bean;

public class Person {

    private int person_Id;
    private String first_name;
    private String last_name;
    private String role;

    public Person() {

    }

    public Person(int person_Id, String first_name, String last_name, String role) {
        super();
        this.person_Id = person_Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public int getPerson_Id() {
        return person_Id;
    }

    public void setPerson_Id(int person_Id) {
        this.person_Id = person_Id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("person_Id=").append(person_Id);
        sb.append(", first_name='").append(first_name).append('\'');
        sb.append(", last_name='").append(last_name).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
