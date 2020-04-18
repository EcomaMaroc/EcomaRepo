package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.Color;

public interface ColorRepository extends MongoRepository<Color, Long>{

}
