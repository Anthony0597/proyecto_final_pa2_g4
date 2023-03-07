package com.example.demo.repo;

import com.example.demo.modelo.Reserva;

public interface IReservaRepo {
	
	public void insertar(Reserva reserva);
	public void actualizar(Reserva reserva);
	public Reserva buscar(Integer numero);
	public void eliminar(Integer numero);

}
