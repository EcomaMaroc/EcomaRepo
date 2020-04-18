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
import com.ecoma.api.EcomaPrj.Models.State;
import com.ecoma.api.EcomaPrj.Repository.CategoryRepository;
import com.ecoma.api.EcomaPrj.Repository.StateRepository;

@RestController
@RequestMapping("/States")
public class StateController {

	@Autowired
    private StateRepository stateRepository;
	
	@GetMapping("/all")
	public List<State> GetStates(){
		return stateRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<State> getState(@PathVariable long id){
		return stateRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteState(@PathVariable long id) {
		stateRepository.deleteById(id);
		return "State deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public State UpdateState(@RequestBody State state, @PathVariable Long id) {

	    return stateRepository.findById(id)
	      .map(Oldstate -> {
	    	  Oldstate.setName(state.getName());
	        return stateRepository.save(state);
	      })
	      .orElseGet(() -> {
	    	  state.setId(id);
	        return stateRepository.save(state);
	      });
	  }
}
