package com.naveen.neo4jAccess.Entities;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Products {
	
	@Id
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String productId) {
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
