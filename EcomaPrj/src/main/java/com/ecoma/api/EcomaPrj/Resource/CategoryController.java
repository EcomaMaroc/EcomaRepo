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

import com.ecoma.api.EcomaPrj.Models.Category;
import com.ecoma.api.EcomaPrj.Repository.CategoryRepository;

@RestController
@RequestMapping("/Categories")
public class CategoryController {

	@Autowired
    private CategoryRepository categoryRepository;
	
	@GetMapping("/all")
	public List<Category> GetCategories(){
		return categoryRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Category> getCategory(@PathVariable long id){
		return categoryRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteCategory(@PathVariable long id) {
		categoryRepository.deleteById(id);
		return "Category deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Category UpdateCategory(@RequestBody Category category, @PathVariable Long id) {

	    return categoryRepository.findById(id)
	      .map(OldCategory -> {
	    	  OldCategory.setName(category.getName());
	        return categoryRepository.save(category);
	      })
	      .orElseGet(() -> {
	    	  category.setId(id);
	        return categoryRepository.save(category);
	      });
	  }
}
