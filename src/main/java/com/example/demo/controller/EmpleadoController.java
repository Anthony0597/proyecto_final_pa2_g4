package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Cliente;
import com.example.demo.service.IClienteService;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/registroClientPorEmpl")
	public String registroCliente(Cliente cliente) {
		return "vistaRegistroEmpleado";
	}

	@PostMapping("/insertar")
	public String insertarCliente(Cliente cliente) {
		cliente.setRegistro("E");
		this.clienteService.registrarse(cliente);
		return "redirect:/empleados/registroClientPorEmpl";
	}

	@PutMapping("/actualizar/{ced}")
	public String actualizar(@PathVariable("ced") String cedula, Cliente cliente) {
		cliente.setCedula(cedula);
		this.clienteService.actualizarDatos(cliente);
		return "redirect:/empleados/buscar";
	}

}
