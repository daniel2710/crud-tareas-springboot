package com.tareas.dao;

import org.springframework.data.repository.CrudRepository;

import com.tareas.model.Tarea;


// Esta interfaz va a utilizar las funciones crud de springBoot


//Extiende de crudRepository, se le añade un tipo de dato que es <Tarea (el modelo)> y el tipo de datos de su identificador (ID)
public interface TareaDao extends CrudRepository<Tarea, Integer>{

}
