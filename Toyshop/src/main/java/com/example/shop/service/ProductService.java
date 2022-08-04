package com.example.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.entity.Toy;
import com.example.shop.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
private ProductRepository repository;

public Toy saveToy(Toy toy) {
	return repository.save(toy);
}
 
	public List<Toy> saveToys(List<Toy> toys) {
		return repository.saveAll(toys);
}
	public List<Toy> getToys() {
		return repository.findAll();
	}
	public Toy getToyById(int id) {
		return repository.findById(id).orElse(null);
	}
	public Toy getToyByName(String name) {
		return repository.findByName(name);
	}
	public String deleteToy(int id) {
        repository.deleteById(id);
        return "Product removed : "+id;
	}
	public Toy updateToy(Toy toy) {
	Toy existtoy =repository.findById(toy.getId()).orElse(null);
	existtoy.setName(toy.getName());
	existtoy.setPrice(toy.getPrice());
	return repository.save(existtoy);
	}
	
	
	
}