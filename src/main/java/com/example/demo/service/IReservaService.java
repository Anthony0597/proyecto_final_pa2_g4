package com.example.demo.service;

import java.time.LocalDateTime;

public interface IReservaService {
	
	public void reservar(String cedula, String placa, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
