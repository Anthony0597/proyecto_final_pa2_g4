package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Vendedor;
import com.example.demo.service.IVendedorService;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {
	
	@Autowired
	private IVendedorService vendedorService;
	
	@GetMapping("/registroVendedor")
	public String registroVendedor(Vendedor vendedor) {
		return "vistaRegistroVendedor";
	}

	@PostMapping("/insertar")
	public String insertarVendedor(Vendedor vendedor) {
		this.vendedorService.guardar(vendedor);
		return "redirect:/inicios/empleado";
	}
}
