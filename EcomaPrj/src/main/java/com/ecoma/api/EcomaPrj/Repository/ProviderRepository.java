package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecoma.api.EcomaPrj.Models.Provider;

public interface ProviderRepository extends MongoRepository<Provider, Long>{

}