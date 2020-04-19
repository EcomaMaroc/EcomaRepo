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

import com.ecoma.api.EcomaPrj.Models.Comments;
import com.ecoma.api.EcomaPrj.Repository.CommentsRepository;


@RestController
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	private CommentsRepository repo;
	
	@PostMapping("/add")
	public Comments saveComment(@RequestBody Comments Comment) {
		repo.save(Comment);
		return Comment;
	}
	
	@GetMapping("/find")
	public List<Comments> getComments(){
		return repo.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Comments> getComment(@PathVariable Long id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteComments(@PathVariable Long id) {
		repo.deleteById(id);
		return "Comment deleted with id :"+id;
	}
}
