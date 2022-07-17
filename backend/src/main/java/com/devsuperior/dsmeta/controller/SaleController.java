package com.devsuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.services.SalesService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
@Autowired
private SalesService service;

@GetMapping
public List<Sale> findSales(){
	return service.findSales();
}
}
