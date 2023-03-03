package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void inserta(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscarMarca(String marca);
	public void eliminar(Integer id);
	
	public List<Vehiculo> buscarMarcaModelo(String marca, String modelo);

}
