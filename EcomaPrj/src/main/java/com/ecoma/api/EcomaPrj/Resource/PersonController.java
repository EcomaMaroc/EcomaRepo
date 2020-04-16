package com.ecoma.api.EcomaPrj.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecoma.api.EcomaPrj.Models.Person;
import com.ecoma.api.EcomaPrj.Repository.PersonRepository;


@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/addPerson")
	public String saveAdmin(@RequestBody Person person) {
		System.out.println("holaaa");
		System.out.println("email "+person.getEmail());
		personRepository.save(person);
		return "Added person with id : "+person.getId();
	}
	
	@GetMapping("/findPersons")
	public List<Person> getPersons(){
		return personRepository.findAll();
	}
	
	@GetMapping("/findPersons/{id}")
	public Optional<Person> getPerson(@PathVariable int id){
		return personRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeletePerson(@PathVariable int id) {
		personRepository.deleteById(id);
		return "Person deleted with id :"+id;
	}
}
