package com.truper.service;

import com.truper.entity.Orden;
import com.truper.entity.Producto;

public interface OrdenService {
	
	public Orden save(Orden orden);
	public Orden finById(Integer id);

}
