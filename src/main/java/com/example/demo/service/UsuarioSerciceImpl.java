package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Usuario;
import com.example.demo.repo.IClienteRepo;
import com.example.demo.repo.IUsuarioRepo;

@Service
public class UsuarioSerciceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepo usuarioRepo;
	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.insertar(usuario);
	}

}
