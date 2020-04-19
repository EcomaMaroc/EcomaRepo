package com.ecoma.api.EcomaPrj.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecoma.api.EcomaPrj.Models.Person;
import com.ecoma.api.EcomaPrj.Repository.PersonRepository;


@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/all")
	public List<Person> getPersons(){
		return personRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Person> getPerson(@PathVariable long id){
		return personRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeletePerson(@PathVariable long id) {
		personRepository.deleteById(id);
		return "Person deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Person UpdatePerson(@RequestBody Person person, @PathVariable Long id) {

	    return personRepository.findById(id)
	      .map(OldPerson -> {
	    	  OldPerson.setFirstName(person.getFirstName());
	    	  OldPerson.setLastName(person.getLastName());
	    	  OldPerson.setPhone(person.getPhone());
	    	  OldPerson.setEmail(person.getEmail());
	    	  OldPerson.setPicture(person.getPicture());
	    	  OldPerson.setPassword(person.getPassword());
	    	  OldPerson.setAdress(person.getAdress());
	    	  OldPerson.setAge(person.getAge());
	    	  OldPerson.setCin(person.getCin());
	        return personRepository.save(person);
	      })
	      .orElseGet(() -> {
	    	  person.setId(id);
	        return personRepository.save(person);
	      });
	  }
}
