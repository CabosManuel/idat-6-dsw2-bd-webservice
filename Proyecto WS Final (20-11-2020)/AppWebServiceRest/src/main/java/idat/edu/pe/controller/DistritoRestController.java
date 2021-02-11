package idat.edu.pe.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.mapper.DistritoMapper;
import idat.edu.pe.mapper.EstudianteMapper;
import idat.edu.pe.mapper.MapperUtil;
import idat.edu.pe.model.Distrito;
import idat.edu.pe.model.Estudiante;
import idat.edu.pe.service.DistritoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/distritos")
public class DistritoRestController {
	
	@Autowired
	private DistritoService distritoService;
	
	//@Autowired
	//private MapperUtil mapp;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		//List<Distrito> itemsDistrito = distritoService.findAll();
		//List<DistritoMapper> itemsDistritoMapper = MapperUtil.convertD(itemsDistrito);
		
		Collection<DistritoMapper> itemsDistritoMapper = MapperUtil.convertCollMapToCollDistritoMapper(distritoService.all());
		return new ResponseEntity<>(itemsDistritoMapper, HttpStatus.OK);
		
		/*if(itemsDistrito.isEmpty()) {
			return new ResponseEntity<>(itemsDistritoMapper, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(itemsDistritoMapper, HttpStatus.OK);*/
	}
	
	@GetMapping("/buscar/{distritoId}")
	public ResponseEntity<?> buscar(@PathVariable Integer distritoId){
		
		Distrito distritoOb = distritoService.findById(distritoId);
		if(distritoOb!=null) {
			return new ResponseEntity<>(distritoOb, HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Distrito distrito){
		
		distritoService.insert(distrito);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/editar/{distritoId}")
	public ResponseEntity<?> editar(@PathVariable Integer distritoId, @RequestBody Distrito newDistrito){
		
		Distrito distritoDb = distritoService.findById(distritoId);
		if(distritoDb!=null) {
			distritoDb.setNombre(newDistrito.getNombre());
			distritoService.update(distritoDb);
			return new ResponseEntity<>(distritoDb, HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/listar_distritos")
	public ResponseEntity<?> listarDistritos(){
		return new ResponseEntity<>(distritoService.all(), HttpStatus.OK);
	}
}
