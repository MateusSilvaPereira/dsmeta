package com.devsuperior.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmeta.entity.Sale;

@Repository
public interface SalesRepository extends JpaRepository<Sale, Long>{

}
