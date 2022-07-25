package com.tareas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
// Vamos a implementar el servicio, el la interfaz anterior simplemente lo declaramos
@Service
public class TareaServiceImplement  implements TareaService{
	
	// Autowired para que nos permita inyectar dependencias
	@Autowired
	// Para utilizar las funciones de TareaDao y vamos a llamarlo tareaDao
	private TareaDao tareaDao;
	
	// Para Listar
    @Override
    @Transactional(readOnly=true)
	public List<Tarea> findAll(){
		return (List<Tarea>) tareaDao.findAll();
	}
	
	// Para guardar
    @Override
    @Transactional(readOnly=false)
	public Tarea save(Tarea tarea) {
		return tareaDao.save(tarea);
	}
	
	// Para seleccionar uno
    @Override
    @Transactional(readOnly=true)
	public Tarea findById(Integer id) {
		return tareaDao.findById(id).orElse(null);
	}
	
	
	// Para eliminar
    @Override
    @Transactional(readOnly=false)
	public void delete (Integer id) {
		tareaDao.deleteById(id);
	}
	
	
}
