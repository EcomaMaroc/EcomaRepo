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

import com.ecoma.api.EcomaPrj.Models.Color;
import com.ecoma.api.EcomaPrj.Repository.ColorRepository;

@RestController
@RequestMapping("/Colors")
public class ColorController {

	@Autowired
    private ColorRepository colorRepository;
	
	@GetMapping("/all")
	public List<Color> GetColors(){
		return colorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Color> getColor(@PathVariable long id){
		return colorRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteColor(@PathVariable long id) {
		colorRepository.deleteById(id);
		return "Color deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Color UpdateColor(@RequestBody Color color, @PathVariable Long id) {

	    return colorRepository.findById(id)
	      .map(OldColor -> {
	    	  OldColor.setName(color.getName());
	        return colorRepository.save(color);
	      })
	      .orElseGet(() -> {
	        color.setId(id);
	        return colorRepository.save(color);
	      });
	  }
}
