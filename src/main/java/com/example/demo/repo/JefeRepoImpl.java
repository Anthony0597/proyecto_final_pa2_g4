package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Jefe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class JefeRepoImpl implements IJefeRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Jefe jefe) {
		// TODO Auto-generated method stub
		this.entityManager.persist(jefe);
	}

}
