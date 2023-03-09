package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vendedor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class VendedorRepoImpl implements IVendedorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vendedor);
	}

}
