package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Khaledi");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Rachid");
		p.setLastName("Rachidi");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Basma");
		p.setLastName("Bassimi");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("Adil");
		p.setLastName("Adili");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("webhook");
		p.setLastName("testJenjinsJob");
		persons.add(p);

		p = new Person();
		p.setId("6");
		p.setAge(30);
		p.setFirstName("webhook2");
		p.setLastName("testJenjinsJob2");
		persons.add(p);

		p = new Person();
		p.setId("8");
		p.setAge(50);

		p.setFirstName("iwfsKenkins");
		p.setLastName("jenkinsIWFS");

		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

