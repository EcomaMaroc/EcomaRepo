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

import com.ecoma.api.EcomaPrj.Models.Feeds;
import com.ecoma.api.EcomaPrj.Repository.FeedsRepository;


@RestController
@RequestMapping("/feeds")
public class FeedsController {

	@Autowired
	private FeedsRepository repo;
	
	@PostMapping("/add")
	public Feeds saveFeed(@RequestBody Feeds feed) {
		repo.save(feed);
		return feed;
	}
	
	@GetMapping("/find")
	public List<Feeds> getFeeds(){
		return repo.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Feeds> getFeed(@PathVariable Long id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteFeed(@PathVariable Long id) {
		repo.deleteById(id);
		return "Feed deleted with id :"+id;
	}
}
