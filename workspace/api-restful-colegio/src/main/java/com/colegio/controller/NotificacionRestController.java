package com.colegio.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.service.NotificacionService;

@RestController
@RequestMapping("/notificacion")
public class NotificacionRestController {
	
	@Autowired
	private NotificacionService notifService;
	
	@PutMapping("/cambiar_estado/{notificacionId}/{estado}")
	public ResponseEntity<?> cambiarEstado(@PathVariable Character estado,@PathVariable Integer notificacionId){
		try {
			notifService.cambiarEstado(estado, notificacionId);
			Map<String, Character> r = new HashMap<>();
			r.put("estado", estado);
			return new ResponseEntity<>(r, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
}
