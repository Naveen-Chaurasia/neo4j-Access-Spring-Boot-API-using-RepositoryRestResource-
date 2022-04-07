package com.naveen.neo4jAccess.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.neo4jAccess.Entities.Category;
import com.naveen.neo4jAccess.Entities.ProductComponents;
import com.naveen.neo4jAccess.Entities.Products;
//import com.naveen.neo4jAccess.controllers.Mono;
import com.naveen.neo4jAccess.repositories.CategoryRepo;
import com.naveen.neo4jAccess.repositories.productComponentsRepo;
import com.naveen.neo4jAccess.repositories.productRepo;

@Service
public class service {

	@Autowired
	CategoryRepo cr;
	@Autowired
	productRepo pr;
	@Autowired
	productComponentsRepo pcr;
	
	
	public List<Products> getProducts()
	{
		return pr.findAll();
	}
	
	public List<ProductComponents> getProductComponents()
	{
		return pcr.findAll();
	}
	
	public List<Category> getCategories() {
		
		
		/*
		 * List<Category> l= new ArrayList<Category>(); l=cr.findAll();
		 * System.out.println(l.size()); for(Category c:l) { System.out.println(c); }
		 */
		return null;//cr.findAll();
	}

//	public Category findOneById(Long id) {
//		
//		return cr.findById(id)
//		
//	}
	

}
