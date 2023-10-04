package com.demo.proyecto.controller;

import java.util.List;
import java.util.Objects;
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

import com.demo.proyecto.dto.CitaDto;
import com.demo.proyecto.model.CitaModel;
import com.demo.proyecto.service.CitaService;

@RestController
@RequestMapping("/api/cita")
public class CitaController {

	@Autowired
	private CitaService citaService;
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<CitaDto>> findId(@PathVariable("id") int id) {
		
		Optional<CitaDto> result = citaService.getId(id);
        
        if (!result.isPresent()) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found");
	    }
		
        return ResponseEntity.ok(result);
    }
	
	@GetMapping("/list")
    public ResponseEntity<List<CitaDto>> list() {
        return ResponseEntity.ok(citaService.getListCitas());
    }
	
	@PostMapping("/")
    public ResponseEntity<CitaDto> save(@RequestBody CitaModel cita) {
		
		CitaDto result =  citaService.save(cita);
	
		if (Objects.isNull(result)) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found");
	    }
		
        return ResponseEntity.ok(result);
    }
}
