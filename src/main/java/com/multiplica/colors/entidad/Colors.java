package com.multiplica.colors.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_COLORS", schema = "bd_multiplica")
public class Colors implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer year;
	@Column(name = "pantone_value")
	private String pantoneValue;
	
	protected Colors() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPantoneValue() {
		return pantoneValue;
	}

	public void setPantoneValue(String pantoneValue) {
		this.pantoneValue = pantoneValue;
	}

}
