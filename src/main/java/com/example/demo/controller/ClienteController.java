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
import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IVehiculoService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVehiculoService iVehiculoService;

	@GetMapping("/principal")
	public String principalCliente(Cliente cliente) {
		return "Cliente";
	}

	@GetMapping("/registroCliente")
	public String registroCliente(Cliente cliente) {
		return "vistaRegistroCliente";
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
	
	@DeleteMapping("/borrar/{ape}")
	public String eliminarCliente(@PathVariable("ape") String apellido) {
		// this.clienteService.borrarApellido(apellido);
		return "redirect:/clientes/visualizar";
	}

	@GetMapping("/vehiculoDisponible")
	public String buscarVehiculo(VehiculoDTO vehiculo) {
		return "vistaVehiculosDisponibles";
	}
	
	@GetMapping("/buscarDisponible/{mar} & {mod}")
	public String buscarVehiculo(@PathVariable("mar") String marca, @PathVariable("mod") String modelo,
			Model model) {
		List<VehiculoDTO> vehiculos = this.iVehiculoService.buscarVehiculosDisponiblres(marca, modelo);
		model.addAttribute("vehiculos", vehiculos);
		return "redirect:/clientes/vistaVehiculosDisponibles";
	}

}
