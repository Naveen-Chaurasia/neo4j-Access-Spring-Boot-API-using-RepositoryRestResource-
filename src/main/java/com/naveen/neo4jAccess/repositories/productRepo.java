package com.naveen.neo4jAccess.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.naveen.neo4jAccess.Entities.Products;

@Repository
public interface productRepo extends Neo4jRepository<Products,String >{

}
