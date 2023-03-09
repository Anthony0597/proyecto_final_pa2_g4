package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IJefeRepo;
@Service
public class JefeServiceImpl implements IJefeService {
	
	@Autowired
	private IJefeRepo iJefeRepo;

	@Override
	public void ingresar(String nombre, String apellido) {
		// TODO Auto-generated method stub
		//this.iJefeRepo.insertar();
		
	}


}
