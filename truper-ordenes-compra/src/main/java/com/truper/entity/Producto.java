package com.truper.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Producto implements Serializable {

	private static final long serialVersionUID = 1010090620048652495L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoId;
	
	@ManyToOne
	private Orden ordenId;
	private String codigo;
	private String descripcion;
	private Double precio;

}
