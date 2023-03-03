package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	
	public List<Vehiculo> buscarVehiculosDisponiblres(String marca, String modelo);
	

}
