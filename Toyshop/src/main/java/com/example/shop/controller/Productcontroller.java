package com.example.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shop.entity.Toy;
import com.example.shop.service.ProductService;

@RestController
public class Productcontroller {
	@Autowired
	private ProductService service;
@PostMapping("/addToy")
	public Toy addToy(@RequestBody Toy toy) {
		return service.saveToy(toy);
	}
@PostMapping("/addToys")
	public List<Toy> addToys(@RequestBody List<Toy> toy) {
		return service.saveToys(toy);
	}
@GetMapping("/Toys")
public List<Toy> findAllToys(){
	return service.getToys();
}
@GetMapping("/Toy/{id}")
public Toy findToyById(@PathVariable int id){
	return service.getToyById(id);
}
@GetMapping("/Toy/{name}")
public Toy findToyByName(@PathVariable  String name){
	return service.getToyByName(name);
}
@PutMapping("/update")
public Toy updateToy(@RequestBody Toy toy) {
	return service.updateToy(toy);
}
@DeleteMapping("/delete/{id}")
public String deleteToy(@PathVariable int id) {
	return service.deleteToy(id);
}

}
