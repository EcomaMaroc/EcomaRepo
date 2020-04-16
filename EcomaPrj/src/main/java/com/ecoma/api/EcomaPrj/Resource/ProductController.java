package com.ecoma.api.EcomaPrj.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoma.api.EcomaPrj.Models.Person;
import com.ecoma.api.EcomaPrj.Models.Product;
import com.ecoma.api.EcomaPrj.Repository.ProductRepository;

@RestController
@RequestMapping("/Products")
public class ProductController {

	@Autowired
    private ProductRepository productRepository;
	
	/*@PostMapping("/addProduct")
	public String saveCommand(@RequestBody Product product) {
		product.toString();
		productRepository.save(product);
		return "Added product with id : "+product.getId();
	}*/
	
	@GetMapping("/all")
	public List<Product> GetProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable long id){
		return productRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteProduct(@PathVariable long id) {
		productRepository.deleteById(id);
		return "Product deleted with id :"+id;
	}
	
	@PutMapping("/addOrUpdate/{id}")
	public Product UpdateProduct(@RequestBody Product product, @PathVariable Long id) {

	    return productRepository.findById(id)
	      .map(OldProduct -> {
	    	OldProduct.setName(product.getName());
	    	OldProduct.setQte(product.getQte());
	    	OldProduct.setBuyingPrice(product.getBuyingPrice());
	    	OldProduct.setSallingPrice(product.getSallingPrice());
	    	OldProduct.setCorruptPcs(product.getCorruptPcs());
	    	OldProduct.setQteBuyed(product.getQteBuyed());
	    	OldProduct.setQteSaled(product.getQteSaled());
	    	OldProduct.setDescription(product.getDescription());
	    	OldProduct.setCategory(product.getCategory());
	    	OldProduct.setProvider(product.getProvider());
	    	OldProduct.setColor(product.getColor());
	    	OldProduct.setSize(product.getSize());
	    	OldProduct.setState(product.getState());
	        return productRepository.save(product);
	      })
	      .orElseGet(() -> {
	        product.setId(id);
	        return productRepository.save(product);
	      });
	  }
}
