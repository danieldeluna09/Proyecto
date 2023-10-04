package com.demo.proyecto.dto;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tapaciente")
public class PacienteDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Tipo")
	private String tipo;
	
	@Column(name="Nacimiento")
	private Timestamp nacimiento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPropietario")
	PropietarioDto propietarioDto;
	
	@Column(name="Telefono")
	private String telefono;

}
