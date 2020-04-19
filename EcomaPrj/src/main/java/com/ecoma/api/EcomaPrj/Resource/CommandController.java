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

import com.ecoma.api.EcomaPrj.Models.Command;
import com.ecoma.api.EcomaPrj.Repository.CommandRepository;

@RestController
@RequestMapping("/Commands")
public class CommandController {

	@Autowired
	private CommandRepository commandRepository;
	
	@GetMapping("/all")
	public List<Command> GetCommands(){
		return commandRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Command> getCommand(@PathVariable long id){
		return commandRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteCommand(@PathVariable long id) {
		commandRepository.deleteById(id);
		return "Product deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Command UpdateCommand(@RequestBody Command command, @PathVariable Long id) {

	    return commandRepository.findById(id)
	      .map(OldCommand -> {
	    	OldCommand.setTotalQte(command.getTotalQte());
	    	OldCommand.setDescription(command.getDescription());
	    	OldCommand.setBuyerCin(command.getBuyerCin());
	    	OldCommand.setBuyerAdress(command.getBuyerAdress());
	    	OldCommand.setBuyerName(command.getBuyerName());
	    	OldCommand.setTotalPrice(command.getTotalPrice());
	    	OldCommand.setAdminIsPayed(command.isAdminIsPayed());
	    	OldCommand.setDeliveryManIsPayed(command.isDeliveryManIsPayed());
	    	OldCommand.setIdProduct(command.getIdProduct());
	    	OldCommand.setIdTeamMember(command.getIdTeamMember());
	    	OldCommand.setIdDeliveryMan(command.getIdDeliveryMan());
	    	OldCommand.setIdState(command.getIdState());
	        return commandRepository.save(command);
	      })
	      .orElseGet(() -> {
	    	  command.setId(id);
	        return commandRepository.save(command);
	      });
	  }
}
