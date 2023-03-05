package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Reserva;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ReservaRepoImpl implements IReservaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Reserva reserva) {
		// TODO Auto-generated method stub
		this.entityManager.persist(reserva);
	}

	@Override
	public void actualizar(Reserva reserva) {
		// TODO Auto-generated method stub
		this.entityManager.merge(reserva);
	}

	@Override
	public Reserva buscar(Integer numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Reserva.class, numero);
	}

	@Override
	public void eliminar(Integer numero) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(numero));
	}

}
