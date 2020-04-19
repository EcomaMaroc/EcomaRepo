package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecoma.api.EcomaPrj.Models.State;

public interface StateRepository extends MongoRepository<State, Long>{

}
