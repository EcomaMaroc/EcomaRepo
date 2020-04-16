package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.Command;

public interface CommandRepository extends MongoRepository<Command, Long>{

}
	

