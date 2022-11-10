package com.truper.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ordenes")
@Data
public class Orden implements Serializable {

	private static final long serialVersionUID = 7048888648302841321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ordenId;
	
	@ManyToOne
	private Sucursal sucursalId;
	private Date fecha;
	private Double total;

}
