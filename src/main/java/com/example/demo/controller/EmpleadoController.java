package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.ClienteDTO;
import com.example.demo.service.IClienteService;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/registroClientPorEmpl")
	public String registroCliente(Cliente cliente) {
		return "vistaRegistroClientePorEmpleado";
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

	@GetMapping("/visualizar/{apellido}")
	public String mostrarCliente(@PathVariable("apellido") String apellido, Model modelo) {
		List<ClienteDTO> clientes = this.clienteService.buscarPorApellido(apellido);
		modelo.addAttribute("clientes", clientes);
		return "vistaMostrarCliente";
	}

}
