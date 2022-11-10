package com.truper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.entity.Orden;
import com.truper.entity.Producto;
import com.truper.service.OrdenService;
import com.truper.service.ProductoService;

@RestController
@RequestMapping("/ordenCompra")
public class OrdenCompraController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private OrdenService ordenService;
	
	@PostMapping("/save")
	public List<Producto> saveProducto(@RequestBody List<Producto> productos) {
		Orden orden = ordenService.save(productos.get(0).getOrdenId());
		for(Producto p : productos) {
			p.setOrdenId(orden);
			p = productoService.saveOrdenCompra(p);
		}
		return productos;
	}
	
//	@GetMapping("/{id}")
//	public Producto getProducto(@PathVariable Integer id) {
//		return productoService.findById(id);
//	}
	
	@GetMapping("/{id}")
	public List<Producto> getProducto(@PathVariable Integer id) {
		return productoService.findByOrdenIdOrdenId(id);
	}
	
}
