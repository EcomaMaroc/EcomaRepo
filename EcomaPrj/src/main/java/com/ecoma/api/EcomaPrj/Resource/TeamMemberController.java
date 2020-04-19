package com.ecoma.api.EcomaPrj.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoma.api.EcomaPrj.Models.TeamMember;
import com.ecoma.api.EcomaPrj.Repository.TeamMemberRepository;

@RestController
@RequestMapping("/TeamMembers")
public class TeamMemberController {

	@Autowired
	private TeamMemberRepository teamMemberRepository;
	
	@GetMapping("/all")
	public List<TeamMember> GetTeamMembers(){
		return teamMemberRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<TeamMember> getTeamMember(@PathVariable long id){
		return teamMemberRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteTeamMember(@PathVariable long id) {
		teamMemberRepository.deleteById(id);
		return "TeamMember deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public TeamMember UpdateTeamMember(@RequestBody TeamMember teamMember, @PathVariable Long id) {

		return teamMemberRepository.findById(id)
			      .map(OldTeamMember -> {
			    	  OldTeamMember.setIdPerson(teamMember.getIdPerson());
			    	  OldTeamMember.setIdRole(teamMember.getIdRole());
			    	  OldTeamMember.setIdAdmin(teamMember.getIdAdmin());
			    	  return teamMemberRepository.save(teamMember);
			      })
			      .orElseGet(() -> {
			    	  teamMember.setId(id);
			        return teamMemberRepository.save(teamMember);
			      });
	  }
}
