package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Jefe;
import com.example.demo.service.IJefeService;

@Controller
@RequestMapping("/empleados")
public class JefeController {

	@Autowired
	private IJefeService iJefeService;

	
	
}
