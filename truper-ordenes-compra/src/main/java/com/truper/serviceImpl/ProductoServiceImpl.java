package com.truper.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.entity.Producto;
import com.truper.repository.ProductoRepository;
import com.truper.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto saveOrdenCompra(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto findById(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public List<Producto> findByOrdenIdOrdenId(Integer id) {
		return productoRepository.findByOrdenIdOrdenId(id);
	}

}
