package com.demo.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.proyecto.dto.VeterinarioDto;


@Repository
public interface VeterinarioRepository extends JpaRepository<VeterinarioDto, Integer>{

}
