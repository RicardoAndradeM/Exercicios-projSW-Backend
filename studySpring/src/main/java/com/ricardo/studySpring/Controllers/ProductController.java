package com.ricardo.studySpring.Controllers;

import java.util.List;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.studySpring.entities.Product;
import com.ricardo.studySpring.exceptions.EmployeeNotFoundException;
import com.ricardo.studySpring.repotories.ProductRepository;

@RestController
public class ProductController {

	public final ProductRepository repository;
	
	public ProductController(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return this.repository.findAll();
	}
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return this.repository.save(product);
	}
	
	@GetMapping("/products/{id}")
	public Resource<Product> getProductByID(@PathVariable Long id) {
		Product product =  this.repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
		return new Resource<Product>(product, linkTo(methodOn(ProductController.class).getProductByID(id)).withSelfRel(),
			    linkTo(methodOn(ProductController.class).getProducts()).withRel("employees"));
	}
	@PutMapping("/products/{id}")
	
	public Product updateOrAddProduct(@PathVariable Long id, @RequestBody Product product) {
		product.setCodigo(id);
		System.out.println(product);
		return this.repository.save(product);
	}
	
	@DeleteMapping("products/{id}")
	public void deleteProduct(@PathVariable Long id) {
		this.repository.deleteById(id);
	}
}
