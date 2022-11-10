package com.truper.service;

import java.util.List;

import com.truper.entity.Producto;

public interface ProductoService {

	public Producto saveOrdenCompra(Producto producto);
	public Producto findById(Integer id);
	public List<Producto> findByOrdenIdOrdenId(Integer id);
}
