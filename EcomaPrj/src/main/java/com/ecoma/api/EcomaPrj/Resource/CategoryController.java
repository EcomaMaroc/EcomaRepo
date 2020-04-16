package com.ecoma.api.EcomaPrj.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoma.api.EcomaPrj.Models.Category;
import com.ecoma.api.EcomaPrj.Repository.CategoryRepository;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired
    private CategoryRepository categoryRepository;
	
	@PostMapping("/addCategory")
	public String saveCommand(@RequestBody Category category) {
		System.out.println(category.toString());
		categoryRepository.save(category);
		return "Added category with id : "+category.getId()+" and name :"+category.getName();
	}
}
