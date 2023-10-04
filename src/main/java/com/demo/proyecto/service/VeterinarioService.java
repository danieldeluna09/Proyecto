package com.demo.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.demo.proyecto.dto.VeterinarioDto;

public interface VeterinarioService {
	
	public Optional<VeterinarioDto> getId(int id);
	
	public List<VeterinarioDto> getListVeterinario();
	
	public VeterinarioDto save(VeterinarioDto veterinario);

}
