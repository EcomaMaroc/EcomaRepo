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
import com.ecoma.api.EcomaPrj.Models.Provider;
import com.ecoma.api.EcomaPrj.Repository.ProviderRepository;

@RestController
@RequestMapping("/Providers")
public class ProviderController {

	@Autowired
	private ProviderRepository providerRepository;
	
	@GetMapping("/all")
	public List<Provider> GetProviders(){
		return providerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Provider> getProvider(@PathVariable long id){
		return providerRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteProvider(@PathVariable long id) {
		providerRepository.deleteById(id);
		return "Provider deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Provider UpdateProvider(@RequestBody Provider provider, @PathVariable Long id) {

	    return providerRepository.findById(id)
	      .map(OldProvider -> {
	    	  OldProvider.setName(provider.getName());
	    	  OldProvider.setPhone(provider.getPhone());
	        return providerRepository.save(provider);
	      })
	      .orElseGet(() -> {
	    	  provider.setId(id);
	        return providerRepository.save(provider);
	      });
	  }
}
