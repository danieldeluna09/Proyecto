package com.demo.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.demo.proyecto.dto.PacienteDto;
import com.demo.proyecto.dto.PropietarioDto;
import com.demo.proyecto.service.AltaPacienteService;

@RestController
@RequestMapping("/api/altapaciente")
public class AltaPacienteController {

	@Autowired
	private AltaPacienteService altaPacienteService;
	
	@GetMapping("/paciente/{id}")
    public ResponseEntity<Optional<PacienteDto>> pacienteFindId(@PathVariable("id") int id) {
		
		Optional<PacienteDto> result = altaPacienteService.getPacienteId(id);
		
		if (!result.isPresent()) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found");
	    }
		
        return ResponseEntity.ok(result);
    
	}
	
	@GetMapping("/propietario/{id}")
    public ResponseEntity<Optional<PropietarioDto>> propietarioFindId(@PathVariable("id") int id) {
		
		Optional<PropietarioDto> result = altaPacienteService.getPropietarioId(id);
		
		if (!result.isPresent()) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found");
	    }
		
        return ResponseEntity.ok(result);
		
    }
	
	@GetMapping("/paciente/list")
    public ResponseEntity<List<PacienteDto>> pacienteList() {
        return ResponseEntity.ok(altaPacienteService.getListPacientes());		
    }
	
	@GetMapping("/propietario/list")
    public ResponseEntity<List<PropietarioDto>> propietariosList() {
        return ResponseEntity.ok(altaPacienteService.getListPropietarios());		
    }
	
	@PostMapping("/")
    public PacienteDto save(@RequestBody PacienteDto paciente) {
        return altaPacienteService.saveAlta(paciente);
    }
	
}
