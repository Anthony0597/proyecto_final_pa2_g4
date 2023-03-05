package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;

public interface IVehiculoRepo {
	
	public void inserta(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void eliminar(String placa);
	
	public Vehiculo buscarMarca(String marca);
	public List<VehiculoDTO> buscarMarcaModelo(String marca, String modelo);

}
