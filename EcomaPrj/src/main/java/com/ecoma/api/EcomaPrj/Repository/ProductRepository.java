package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}