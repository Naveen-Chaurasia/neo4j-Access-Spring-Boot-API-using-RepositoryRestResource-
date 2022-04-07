package com.naveen.neo4jAccess.Entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class ProductComponents {
	@Id @GeneratedValue 
	private Long id;
	private String name;
//	private double cuContent;
//	private double steelContent;
//	private double alContent;
//	private double plasticContent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
