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
@Table(name = "tacitas")
public class CitaDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPaciente")
	PacienteDto pacienteDto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idVeterinario")
	VeterinarioDto veterinarioDto;
	
	@Column(name="Fecha")
	private Timestamp fecha;

}
