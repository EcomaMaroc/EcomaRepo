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
import com.ecoma.api.EcomaPrj.Models.Role;
import com.ecoma.api.EcomaPrj.Repository.RoleRepository;

@RestController
@RequestMapping("/Roles")
public class RoleController {

	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/all")
	public List<Role> GetRoles(){
		return roleRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Role> getRole(@PathVariable long id){
		return roleRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteRole(@PathVariable long id) {
		roleRepository.deleteById(id);
		return "Role deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Role UpdateRole(@RequestBody Role role, @PathVariable Long id) {

	    return roleRepository.findById(id)
	      .map(OldRole -> {
	    	  OldRole.setName(role.getName());
	        return roleRepository.save(role);
	      })
	      .orElseGet(() -> {
	    	  role.setId(id);
	        return roleRepository.save(role);
	      });
	  }
}
