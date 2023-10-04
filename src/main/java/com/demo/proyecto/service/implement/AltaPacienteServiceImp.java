package com.demo.proyecto.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.proyecto.dto.PacienteDto;
import com.demo.proyecto.dto.PropietarioDto;
import com.demo.proyecto.repository.PacienteRepository;
import com.demo.proyecto.repository.PropietarioRepository;
import com.demo.proyecto.service.AltaPacienteService;

@Service
public class AltaPacienteServiceImp implements AltaPacienteService {

	@Autowired
	private PropietarioRepository propietarioRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public Optional<PacienteDto> getPacienteId(int id){
		return pacienteRepository.findById(id);	
	}
	
	@Override
	public Optional<PropietarioDto> getPropietarioId(int id){
		return propietarioRepository.findById(id);	
	}
	
	@Override
	public List<PacienteDto> getListPacientes(){
		return pacienteRepository.findAll();
	}
	
	@Override
	public List<PropietarioDto> getListPropietarios(){
		return propietarioRepository.findAll();
	}
	
	@Override
	public PacienteDto saveAlta(PacienteDto paciente){
		PropietarioDto propietario = propietarioRepository.save(paciente.getPropietarioDto());
		paciente.setPropietarioDto(propietario);
		return pacienteRepository.save(paciente);
	}	
}
