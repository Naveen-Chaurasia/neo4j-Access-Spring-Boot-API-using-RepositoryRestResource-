package com.naveen.neo4jAccess.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.naveen.neo4jAccess.Entities.ProductComponents;

@Repository
public interface productComponentsRepo extends Neo4jRepository<ProductComponents, String> {

}
