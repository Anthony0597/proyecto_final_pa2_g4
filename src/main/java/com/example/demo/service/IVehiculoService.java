package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;

public interface IVehiculoService {
	
	
	public List<VehiculoDTO> buscarVehiculosDisponiblres(String marca, String modelo);
	

}
