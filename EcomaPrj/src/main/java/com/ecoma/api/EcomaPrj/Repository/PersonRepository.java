package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.Person;

public interface PersonRepository extends MongoRepository<Person, Long>{

}
