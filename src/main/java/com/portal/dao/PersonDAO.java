package com.portal.dao;

import java.util.List;

import com.portal.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}