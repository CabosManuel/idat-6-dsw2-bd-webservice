package idat.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.mapper.MapperUtil;
import idat.edu.pe.mapper.NotificacionMapper;
import idat.edu.pe.service.NotificacionService;

@RestController
@RequestMapping("/rest/notificacion")
public class NotificacionRestController {
	
	@Autowired
	private NotificacionService notifService;
	
	@PutMapping("/citacion/{notificacionId}/{estado}")
	public ResponseEntity<?> confirmarCitacion(@PathVariable Character estado,@PathVariable Integer notificacionId){
		try {
			notifService.confirmarCitacion(estado, notificacionId);
			return new ResponseEntity<>(estado, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(estado, HttpStatus.CONFLICT);
		}
	}
}
