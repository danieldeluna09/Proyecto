package com.demo.proyecto.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitaModel {
	
	private int idPaciente;
	private int idVeterinario;
	private Timestamp fecha;
	
}
