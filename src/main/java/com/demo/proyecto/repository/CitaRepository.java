package com.demo.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.proyecto.dto.CitaDto;


@Repository
public interface CitaRepository extends JpaRepository<CitaDto, Integer>{

}
