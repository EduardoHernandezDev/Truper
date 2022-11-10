package com.truper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	public List<Producto> findByOrdenIdOrdenId(Integer id);
}
