package com.example.demo.repo;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {
	
	public void  insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscarApellido(String apellido);
	public void eliminar(Integer id);
	

}
