package com.example.sandwichshoprest.sandwich;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sandwiches", path = "sandwiches")
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}
