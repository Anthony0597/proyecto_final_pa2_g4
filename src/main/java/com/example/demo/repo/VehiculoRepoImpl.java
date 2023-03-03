package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void inserta(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculo buscarMarca(String marca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Vehiculo> buscarMarcaModelo(String marca, String modelo) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM vehiculo WHERE vehi_marca=:datoMarca AND vehi_modelo=:datoModelo", Vehiculo.class);
		query.setParameter("datoMarca", marca);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

}
