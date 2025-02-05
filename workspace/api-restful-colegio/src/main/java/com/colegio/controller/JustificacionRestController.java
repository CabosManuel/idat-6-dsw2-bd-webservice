package com.colegio.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.mapper.MapperUtil;
import com.colegio.model.Justificacion;
import com.colegio.service.JustificacionService;


@RestController
@RequestMapping("/justificaciones")
public class JustificacionRestController {
	
	@Autowired
	private JustificacionService justificacionService;
	
//	@GetMapping("/listar_justificaciones")
//	public ResponseEntity<?> getJustificacionesPorDniEstudiante(@RequestParam String dniEstudiante){
//		
//		Collection<Object[]> justificaciones = justificacionService.getJustificacionesByDniEstudiante(dniEstudiante);
//	
//		if(justificaciones.isEmpty())
//			return new ResponseEntity<>("No hay justificaciones", HttpStatus.NO_CONTENT);
//		
//		return new ResponseEntity<>(MapperUtil.convertCollObjects_JustificacionMapper(justificaciones), HttpStatus.OK);
//	}
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		
		Collection<Justificacion> itemsjustificacion=justificacionService.findAll();
	
		if(itemsjustificacion.isEmpty()) 
			
			return new ResponseEntity<>(itemsjustificacion,HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<>(itemsjustificacion,HttpStatus.OK);
					
	}
	
	@GetMapping("/buscar/{justificacionId}")
	public ResponseEntity<?> buscar(@PathVariable Integer justificacionId)
	{
		Justificacion justificacionDb =justificacionService.findById(justificacionId);
		
			if(justificacionDb!= null) {
			
			return new ResponseEntity<>(justificacionDb,HttpStatus.OK);
			}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Justificacion justificacion)
	{
		justificacionService.insert(justificacion);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	

	@PutMapping("/editar/{justificacionId}")
	public ResponseEntity<?> editar(@PathVariable Integer justificacionId,@RequestBody Justificacion newJustificacion)
	{
		Justificacion justificacionDb = justificacionService.findById(justificacionId);
		
		if(justificacionDb!=null) 
		{
		
			justificacionDb.setTitulo(newJustificacion.getTitulo());
			justificacionDb.setDescripcion(newJustificacion.getDescripcion());
			//justificacionDb.setFecha(newJustificacion.getFecha());
		
			
			
			justificacionService.update(justificacionDb);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/borrar/{justificacionId}")
	public ResponseEntity<?> borrar(@PathVariable Integer justificacionId)
	{
		Justificacion justificacionDb = justificacionService.findById(justificacionId);
		
		
		if(justificacionDb!=null)
		{
			justificacionService.delete(justificacionId);
		return new ResponseEntity<Void>(HttpStatus.OK);
		}
			
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?> nuevaJustificacion(@RequestBody Map<String, Object> nuevaJustificacion){
		justificacionService.registrarJustificacion(
				nuevaJustificacion.get("dni_estudiante").toString(), 
				nuevaJustificacion.get("fecha_envio").toString(), 
				nuevaJustificacion.get("fecha_justificacion").toString(), 
				nuevaJustificacion.get("titulo").toString(), 
				nuevaJustificacion.get("descripcion").toString());
		
		Map<String, Integer> respuesta = justificacionService.getUltimoId();
		
		return new ResponseEntity<> (respuesta, HttpStatus.CREATED);
	}
}


