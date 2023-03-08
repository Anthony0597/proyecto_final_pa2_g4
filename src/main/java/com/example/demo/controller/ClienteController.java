package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Cliente;
import com.example.demo.service.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/registroCliente")
	public String registroCliente(Cliente cliente) {
		return "vistaRegistroCliente";
	}

	@GetMapping("/principal")
	public String principalCliente(Cliente cliente) {
		return "vistaPrincipalCliente";
	}

	@PostMapping("/insertar")
	public String insertarCliente(Cliente cliente) {
		cliente.setRegistro("C");
		this.clienteService.registrarse(cliente);
		return "redirect:/clientes/registroCliente";
	}

	@GetMapping("/actualizar")
	public String actualizarCliente(Cliente cliente) {
		return "vistaActualizarCliente";
	}

	@GetMapping("/pruebas")
	public String pruebasCliente(Model modelo) {
		List<Cliente> clientes = new ArrayList<>();
		Cliente clie = new Cliente();
		clie.setCedula("54651");
		clie.setApellido("a");
		clie.setNombre("a");
		clie.setGenero("a");
		clientes.add(clie);
		modelo.addAttribute("clientes", clientes);
		return "vistaMostrarCliente";
	}

	@GetMapping("/visualizar")
	public String mostrarCliente(Model modelo) {
		// List<Cliente> clientes = this.clienteService.buscar();
		List<Cliente> clientes = new ArrayList<>();
		Cliente clie = new Cliente();
		clie.setCedula("54651");
		clie.setApellido("a");
		clie.setNombre("a");
		clie.setGenero("a");
		clientes.add(clie);
		modelo.addAttribute("clientes", clientes);
		return "vistaMostrarCliente";
	}

	@DeleteMapping("/borrar/{ape}")
	public String eliminarCliente(@PathVariable("ape") String apellido) {
		// this.clienteService.borrarApellido(apellido);
		return "redirect:/clientes/visualizar";
	}
}
