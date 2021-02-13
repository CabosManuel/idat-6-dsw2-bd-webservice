package idat.edu.pe.service;

import java.util.Collection;
import java.util.Map;

import idat.edu.pe.model.HorarioCabecera;

public interface HorarioCabeceraService {
	
	public abstract void insert(HorarioCabecera horarioCabecera);
	public abstract void update(HorarioCabecera horarioCabecera);
	//public abstract void delete(String dni_Estudiante);
	public abstract HorarioCabecera findById(Integer horarioCabeceraId);
	public abstract Collection<HorarioCabecera> findAll();
	
	Map<String, ?> getfindOneRegister();

}
