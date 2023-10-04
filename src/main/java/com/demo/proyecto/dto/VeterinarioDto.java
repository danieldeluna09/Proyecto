package com.demo.proyecto.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "taveterinario")
public class VeterinarioDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVeterinario;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellido_Materno")
	private String apellidoMaterno;
	
	@Column(name="Apellido_Paterno")
	private String apellidoPaterno;
	
	@Column(name="Cedula")
	private String cedula;

}
