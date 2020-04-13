package com.ecoma.kamal.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecoma.kamal.EcomaPrj.Models.Person;

public interface PersonRepository extends MongoRepository<Person, Integer>{

}
