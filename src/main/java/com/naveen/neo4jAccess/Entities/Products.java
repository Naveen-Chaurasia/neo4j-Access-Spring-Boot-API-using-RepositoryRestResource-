package com.naveen.neo4jAccess.Entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Products {
	
	@Id @GeneratedValue 
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long productId) {
		this.id = productId;
	}
	public void setName(String productName)
	{
		this.name=productName;
	}
	public String getName()
	{
		return this.name;
	}

}
