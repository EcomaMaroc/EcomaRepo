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

import com.ecoma.api.EcomaPrj.Models.Admin;
import com.ecoma.api.EcomaPrj.Models.Category;
import com.ecoma.api.EcomaPrj.Repository.AdminRepository;
import com.ecoma.api.EcomaPrj.Repository.CategoryRepository;

@RestController
@RequestMapping("/Admins")
public class AdminController {

	@Autowired
    private AdminRepository adminRepository;
	
	@GetMapping("/all")
	public List<Admin> GetAdmins(){
		return adminRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Admin> getAdmin(@PathVariable long id){
		return adminRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteAdmin(@PathVariable long id) {
		adminRepository.deleteById(id);
		return "Admin deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Admin UpdateAdmin(@RequestBody Admin admin, @PathVariable Long id) {

	    return adminRepository.findById(id)
	      .map(OldAdmin -> {
	    	  OldAdmin.setIdPerson(admin.getIdPerson());
	    	  OldAdmin.setIdRole(admin.getIdRole());
	        return adminRepository.save(admin);
	      })
	      .orElseGet(() -> {
	    	  admin.setId(id);
	        return adminRepository.save(admin);
	      });
	  }
}
