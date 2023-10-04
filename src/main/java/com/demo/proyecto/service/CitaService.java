package com.demo.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.demo.proyecto.dto.CitaDto;
import com.demo.proyecto.model.CitaModel;

public interface CitaService {
	
	public Optional<CitaDto> getId(int id);
	
	public List<CitaDto> getListCitas();
	
	public CitaDto save(CitaModel cita);

}
