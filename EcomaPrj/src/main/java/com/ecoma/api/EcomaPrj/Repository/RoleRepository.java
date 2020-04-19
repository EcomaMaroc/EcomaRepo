package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecoma.api.EcomaPrj.Models.Role;

public interface RoleRepository extends MongoRepository<Role, Long>{

}
