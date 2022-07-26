package com.tareas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

// ENTITY porque es una  y TABLE porque va a representar una 
@Entity
@Table(name="tareas_table") 
public class Tarea {
	
	// Aqui los atributos 🔽
	
	// Definimos com ID
	@Id
	// Definimos como autoincrementable, ASI DEBE ESTAR TAMBIEN EN LA BASE DE DATOS
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "Id" )
	private Integer Id;
	
	@Column( name = "Tarea" )
	private String Tarea;
	
	@Column( name = "Finalizado" )
	private Boolean Finalizado;
	
	
	// Getters and Setters
	public Integer getId() {
		return Id;
	}
	
	public String getTarea() {
		return Tarea;
	}
	
	public Boolean getFinalizado() {
		return Finalizado;
	}
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public void setTarea(String Tarea) {
		this.Tarea = Tarea;
	}
	
	public void setFinalizado(Boolean Finalizado) {
		this.Finalizado = Finalizado;
	}

}
