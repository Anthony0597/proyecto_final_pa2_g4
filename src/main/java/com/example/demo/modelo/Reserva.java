package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@SequenceGenerator(name="seq_rese", sequenceName = "seq_rese", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_rese")
	@Column(name="rese_numero")
	private Integer numero;
	@Column(name="rese_valor_subtotal")
	private BigDecimal valorSubtotal;
	@Column(name="rese_estado")
	private String estado;
	@Column(name="rese_iva")
	private BigDecimal iva;
	@Column(name="rese_valor_total")
	private BigDecimal valortotal;
	
	@ManyToOne
	@JoinColumn(name = "rese_cedula_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="rese_placa_vehiculo")
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Reserva [numero=" + numero + ", valorSubtotal=" + valorSubtotal + ", estado=" + estado + ", iva=" + iva
				+ ", valortotal=" + valortotal + "]";
	}

	//SET Y GET
	public BigDecimal getValorSubtotal() {
		return valorSubtotal;
	}

	public void setValorSubtotal(BigDecimal valorSubtotal) {
		this.valorSubtotal = valorSubtotal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getValortotal() {
		return valortotal;
	}

	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	
	

}
