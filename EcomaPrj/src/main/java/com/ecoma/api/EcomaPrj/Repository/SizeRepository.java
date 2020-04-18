package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecoma.api.EcomaPrj.Models.Size;

public interface SizeRepository extends MongoRepository<Size, Long>{

}
