package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {

}
