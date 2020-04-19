package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecoma.api.EcomaPrj.Models.Feeds;

@Repository
public interface FeedsRepository extends MongoRepository<Feeds, Long>{

}
