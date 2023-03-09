package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vendedor;
import com.example.demo.repo.IVendedorRepo;

@Service
public class VendedorServiceImpl implements IVendedorService {

	@Autowired
	private IVendedorRepo vendedorRepo;
	
	@Override
	public void guardar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		this.vendedorRepo.insertar(vendedor);
	}

}
