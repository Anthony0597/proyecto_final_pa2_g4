package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void inserta(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(placa));
	}
	
	@Override
	public List<Vehiculo> buscarMarca(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> query = this.entityManager.createQuery("select v from Vehiculo v where v.Marca=:datoMarca", Vehiculo.class);
		query.setParameter("datoMarca",	marca);
		return query.getResultList();
	}

	@Override
	public List<VehiculoDTO> buscarMarcaModelo(String marca, String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<VehiculoDTO> query = this.entityManager.createQuery(
				"SELECT new com.example.demo.modelo.VehiculoDTO(e.placa, e.modelo, e.marca, e.anio, e.valorDia, e.estado) FROM Vehiculo e WHERE e.marca=:datoMarca AND e.modelo=:datoModelo",
				VehiculoDTO.class);
		query.setParameter("datoMarca", marca);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

	

}
