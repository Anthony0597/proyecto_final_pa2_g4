package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="jefe")
public class Jefe {
	@Column(name="jef_id")
	private Integer id;
	@Column(name="jef_id")
	private String nombre;
	@Column(name="jef_id")
	private String apellido;
	
	//SET and GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//to String
	@Override
	public String toString() {
		return "Jefe [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
}
