package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vehiculo {
	private String placa;
	private String modelo;
	private String marca;
	private LocalDateTime anioFabricacion;//preguntar
	private String pais;
	private String cilindraje;
	private BigDecimal avaluo;
	private BigDecimal valorDia;
	private String numeroPuertas;//preguntar
	
	//SET Y GET
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public LocalDateTime getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(LocalDateTime anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public BigDecimal getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(BigDecimal avaluo) {
		this.avaluo = avaluo;
	}
	public BigDecimal getValorDia() {
		return valorDia;
	}
	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}
	public String getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anioFabricacion="
				+ anioFabricacion + ", pais=" + pais + ", cilindraje=" + cilindraje + ", avaluo=" + avaluo
				+ ", valorDia=" + valorDia + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
		
	
}
