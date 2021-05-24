package com.portal.service;

import java.util.List;

import com.portal.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}