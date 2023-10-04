package com.demo.proyecto.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.proyecto.dto.CitaDto;
import com.demo.proyecto.dto.PacienteDto;
import com.demo.proyecto.dto.VeterinarioDto;
import com.demo.proyecto.model.CitaModel;
import com.demo.proyecto.repository.CitaRepository;
import com.demo.proyecto.service.AltaPacienteService;
import com.demo.proyecto.service.CitaService;
import com.demo.proyecto.service.VeterinarioService;

@Service
public class CitaServiceImp implements CitaService {

	@Autowired
	private CitaRepository citaRepository;
	
	@Autowired
	private VeterinarioService veterinarioService;
	
	@Autowired
	private AltaPacienteService altaPacienteService;
	
	@Override
	public Optional<CitaDto> getId(int id){
		return citaRepository.findById(id);
	}
	
	@Override
	public List<CitaDto> getListCitas(){
		return citaRepository.findAll();
	}
	
	@Override
	public CitaDto save(CitaModel citaModel) {
		
		CitaDto cita = new CitaDto();
		
		Optional<VeterinarioDto> veterinario = veterinarioService.getId(citaModel.getIdVeterinario());
		
		Optional<PacienteDto> paciente = altaPacienteService.getPacienteId(citaModel.getIdPaciente());
		
		if (!paciente.isPresent() || !veterinario.isPresent()) {
			return null;
		}
		
		cita.setVeterinarioDto(veterinario.get());
		cita.setPacienteDto(paciente.get()); 
		cita.setFecha(citaModel.getFecha());
		
		return citaRepository.save(cita);
	}
}
