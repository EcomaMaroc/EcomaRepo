package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.Category;

public interface CategoryRepository extends MongoRepository<Category, Long>{

}
