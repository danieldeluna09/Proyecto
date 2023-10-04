package com.demo.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.proyecto.dto.PacienteDto;


@Repository
public interface PacienteRepository extends JpaRepository<PacienteDto, Integer>{

}
