package com.example.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shop.entity.Toy;
public interface ProductRepository extends JpaRepository<Toy,Integer>
{

	Toy findByName(String name);

}
