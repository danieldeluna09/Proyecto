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

import com.demo.proyecto.dto.VeterinarioDto;
import com.demo.proyecto.service.VeterinarioService;

@RestController
@RequestMapping("/api/veterinario")
public class VeterinarioController {

	@Autowired
	private VeterinarioService veterinarioService;
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<VeterinarioDto>> findId(@PathVariable("id") int id) {
		Optional<VeterinarioDto> result = veterinarioService.getId(id);
		
		if (!result.isPresent()) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found");
	    }
		
        return ResponseEntity.ok(result);
    }
	
	@GetMapping("/list")
    public ResponseEntity<List<VeterinarioDto>> list() {
       return ResponseEntity.ok(veterinarioService.getListVeterinario());
    }
	
	@PostMapping("/")
    public VeterinarioDto save(@RequestBody VeterinarioDto veterinario) {
        return veterinarioService.save(veterinario);
    }
}
