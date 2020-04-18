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
import com.ecoma.api.EcomaPrj.Models.DeliveryMan;
import com.ecoma.api.EcomaPrj.Repository.DeliveryManRepository;

@RestController
@RequestMapping("/DeliveryMens")
public class DeliceryManController {

	@Autowired
	private DeliveryManRepository deliveryManRepository;
	
	@GetMapping("/all")
	public List<DeliveryMan> GetDeliveryMens(){
		return deliveryManRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<DeliveryMan> getDeliveryMan(@PathVariable long id){
		return deliveryManRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteDeliveryMan(@PathVariable long id) {
		deliveryManRepository.deleteById(id);
		return "DeliveryMan deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public DeliveryMan UpdateDeliveryMan(@RequestBody DeliveryMan deliveryMan, @PathVariable Long id) {

	    return deliveryManRepository.findById(id)
	      .map(OlddeliveryMan -> {
	    	  OlddeliveryMan.setIdPerson(deliveryMan.getIdPerson());
	    	  OlddeliveryMan.setIdRole(deliveryMan.getIdRole());
	    	  OlddeliveryMan.setRating(deliveryMan.getRating());
	    	  OlddeliveryMan.setType(deliveryMan.getType());
	    	  OlddeliveryMan.setDeliveredsIteamsNbr(deliveryMan.getDeliveredsIteamsNbr());
	        return deliveryManRepository.save(deliveryMan);
	      })
	      .orElseGet(() -> {
	    	  deliveryMan.setId(id);
	        return deliveryManRepository.save(deliveryMan);
	      });
	  }
}
