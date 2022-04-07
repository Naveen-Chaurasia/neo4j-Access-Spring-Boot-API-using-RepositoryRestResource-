package com.naveen.neo4jAccess.Entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Category {

	@Id @GeneratedValue 
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long categoryId) {
		id = categoryId;
	}

	public void setName(String categoryName) {
		this.name = categoryName;
	}

	public String getName() {
		return this.name;
	}

}
