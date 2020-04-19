package com.ecoma.api.EcomaPrj.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoma.api.EcomaPrj.Models.Replies;
import com.ecoma.api.EcomaPrj.Repository.RepliesRepository;


@RestController
@RequestMapping("/replies")
public class RepliesController {

	@Autowired
	private RepliesRepository repo;
	
	@PostMapping("/add")
	public Replies saveReplie(@RequestBody Replies Replie) {
		repo.save(Replie);
		return Replie;
	}
	
	@GetMapping("/find")
	public List<Replies> getReplies(){
		return repo.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Replies> getReplie(@PathVariable Long id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteReplie(@PathVariable Long id) {
		repo.deleteById(id);
		return "Replie deleted with id :"+id;
	}
}
