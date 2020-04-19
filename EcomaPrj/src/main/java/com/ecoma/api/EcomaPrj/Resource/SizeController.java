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
import com.ecoma.api.EcomaPrj.Models.Size;
import com.ecoma.api.EcomaPrj.Repository.SizeRepository;

@RestController
@RequestMapping("/Sizes")
public class SizeController {

	@Autowired
    private SizeRepository sizeRepository;
	
	@GetMapping("/all")
	public List<Size> GetSizes(){
		return sizeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Size> getSize(@PathVariable long id){
		return sizeRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteSize(@PathVariable long id) {
		sizeRepository.deleteById(id);
		return "Size deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Size UpdateSize(@RequestBody Size size, @PathVariable Long id) {

	    return sizeRepository.findById(id)
	      .map(OldSize -> {
	    	  OldSize.setName(size.getName());
	        return sizeRepository.save(size);
	      })
	      .orElseGet(() -> {
	    	  size.setId(id);
	        return sizeRepository.save(size);
	      });
	  }
}
