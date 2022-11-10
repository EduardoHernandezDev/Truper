package com.truper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.entity.Orden;
import com.truper.entity.Producto;
import com.truper.service.OrdenService;

@RestController
@RequestMapping("/orden")
public class OrdenController {
	
	@Autowired
	private OrdenService ordenService;

	@GetMapping("/{id}")
	public Orden getProducto(@PathVariable Integer id) {
		return ordenService.finById(id);
	}
}
