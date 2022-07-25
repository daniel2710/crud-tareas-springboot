package com.tareas;

import java.util.List;

//Aqui iran las funciones CRUD
public interface TareaService {
	
	// Listar Todo
	public List<Tarea> findAll();
	
	// Guardar una Tarea que le vamos a llamar tarea
	public Tarea save(Tarea tarea);
	
	// Para seleccionar un elemento tipo de datos Integer que va a ser id
	public Tarea findById(Integer id);
	
	// Para eliminar tipo void porque no retona nada
	public void delete (Integer id);


}
