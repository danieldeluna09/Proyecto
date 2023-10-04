package com.demo.proyecto.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.proyecto.dto.VeterinarioDto;
import com.demo.proyecto.repository.VeterinarioRepository;
import com.demo.proyecto.service.VeterinarioService;

@Service
public class VeterinarioServiceImp implements VeterinarioService {

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@Override
	public Optional<VeterinarioDto> getId(int id){		
		return veterinarioRepository.findById(id);
	}
	
	@Override
	public List<VeterinarioDto> getListVeterinario(){
		return veterinarioRepository.findAll();
	}
	
	@Override
	public VeterinarioDto save(VeterinarioDto veterinario) {
		return veterinarioRepository.save(veterinario);
	}
}
