package com.demo.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.demo.proyecto.dto.PacienteDto;
import com.demo.proyecto.dto.PropietarioDto;

public interface AltaPacienteService {
	
	public Optional<PacienteDto> getPacienteId(int id);
	
	public Optional<PropietarioDto> getPropietarioId(int id);
	
    public List<PacienteDto> getListPacientes();
	
	public List<PropietarioDto> getListPropietarios();
	
	public PacienteDto saveAlta(PacienteDto paciente);
}