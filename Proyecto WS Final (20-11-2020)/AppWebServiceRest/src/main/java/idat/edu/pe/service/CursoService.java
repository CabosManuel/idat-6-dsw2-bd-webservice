package idat.edu.pe.service;

import java.util.Collection;

import idat.edu.pe.model.Curso;

public interface CursoService {
	public Collection<Object[]> findByDniEstudiante(String dniEstudiante);
	public Collection<Curso> getfindByNivelGrado(Integer nivelId, Integer gradoId);
}
