package com.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.model.Tarea;
import com.tareas.services.TareaService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/crudtareas")
public class TareaController {

	@Autowired
	private TareaService tareaService;
	
	
	// Para listar 
	@GetMapping("/tareas")
	public List<Tarea> listar(){
		return tareaService.findAll();
	}
	
	// Para guardar
	@PostMapping("/tareas-add")
	// @RequesBody porque vamos a recibir un json
	public Tarea guardar(@RequestBody Tarea tarea) {
		return tareaService.save(tarea);
	}
	
	// Para seleccionar uno
	@GetMapping("/tareas/{id}")
	public Tarea getUnaTarea(@PathVariable Integer id ) {
		return tareaService.findById(id);
	}
	
	// Para Modificar
	@PutMapping("/tareas/{id}")
	public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {
		Tarea tareaActual = tareaService.findById(id);
		
		tareaActual.setTarea(tarea.getTarea());
		
		tareaActual.setFinalizado(tarea.getFinalizado());
		
		return tareaService.save(tareaActual);
	}
	
	// Para Eliminar
	@DeleteMapping("/tareas/{id}")
	public void eliminar(@PathVariable Integer id) {
		tareaService.delete(id);
	}
	
	

}
