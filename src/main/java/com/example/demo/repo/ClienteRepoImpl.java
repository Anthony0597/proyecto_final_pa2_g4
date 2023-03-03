package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

}
