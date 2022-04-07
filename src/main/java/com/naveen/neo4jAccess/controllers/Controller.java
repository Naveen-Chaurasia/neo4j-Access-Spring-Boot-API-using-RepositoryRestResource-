package com.naveen.neo4jAccess.controllers;

import java.util.List;
import java.util.Optional;

import org.neo4j.driver.internal.shaded.reactor.core.publisher.Flux;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.neo4jAccess.Entities.Category;
import com.naveen.neo4jAccess.repositories.CategoryRepo;
import com.naveen.neo4jAccess.services.service;

@RestController
public class Controller {
	
	@Autowired
	service s;
	@Autowired
	CategoryRepo cr;
	
	
	@GetMapping(value="/categories", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	List<Category> getAllCategories()
	{
		
		return null;//cr.findAll();

//		List<Category> categories = s.getCategories();
//		System.out.println("************************************");
//		return categories;

	}
//	@GetMapping("/by-name")
//	Mono<Category> byName(@RequestParam String name) {
//		
//		System.out.println(cr.findByName(name));
//		return cr.findByName(name);
//	}
	
	@GetMapping("/by-id")
	Optional<Category> byTitle(@RequestParam Long id) {
		return cr.findById(id);
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}

}
