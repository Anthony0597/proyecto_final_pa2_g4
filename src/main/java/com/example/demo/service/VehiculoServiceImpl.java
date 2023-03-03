package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repo.IVehiculoRepo;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public List<Vehiculo> buscarVehiculosDisponiblres(String marca, String modelo) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscarMarcaModelo(marca, modelo);
	}

}
