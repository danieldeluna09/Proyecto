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
@Table(name = "tapropietario")
public class PropietarioDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellido_Materno")
	private String apellidoMaterno;
	
	@Column(name="Apellido_Paterno")
	private String apellidoPaterno;

}
