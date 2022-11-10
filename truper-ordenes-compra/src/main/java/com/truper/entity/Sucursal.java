package com.truper.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sucursales")
@Data
public class Sucursal implements Serializable {

	private static final long serialVersionUID = -5033919996051582582L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sucursalId;
	private String nombre;

}
