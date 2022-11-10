package com.truper.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.entity.Orden;
import com.truper.repository.OrdenRepository;
import com.truper.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	private OrdenRepository ordenRepository;
	
	@Override
	public Orden save(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public Orden finById(Integer id) {
		return ordenRepository.findById(id).orElse(null);
	}

}
