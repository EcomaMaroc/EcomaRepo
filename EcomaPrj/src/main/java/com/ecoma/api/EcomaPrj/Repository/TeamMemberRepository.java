package com.ecoma.api.EcomaPrj.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ecoma.api.EcomaPrj.Models.TeamMember;

public interface TeamMemberRepository extends MongoRepository<TeamMember, Long>{

}
