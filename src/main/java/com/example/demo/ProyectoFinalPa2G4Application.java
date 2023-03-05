package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.VehiculoDTO;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoFinalPa2G4Application implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalPa2G4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//List<VehiculoDTO> list= this.iVehiculoService.buscarVehiculosDisponiblres("Chevrolet", "D Max");
		//list.parallelStream().forEach(dato-> System.out.println(dato));
		
		

	}

}
