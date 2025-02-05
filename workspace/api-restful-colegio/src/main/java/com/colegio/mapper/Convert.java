package com.colegio.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.colegio.mapper.convert.ApoderadoConvert;
import com.colegio.model.Apoderado;
import com.colegio.model.Asistencia;
import com.colegio.model.Curso;
import com.colegio.model.Estudiante;
import com.colegio.model.HorarioCabecera;
import com.colegio.model.HorarioDetalle;
import com.colegio.model.Matricula;
import com.colegio.model.Notas;
import com.colegio.model.Trabajador;

public class Convert {

//	public static Collection<EstudianteMapper> convert(Collection<Estudiante> itemsEstudiante) {
//
//		Collection<EstudianteMapper> itemsEstudianteMapper = new ArrayList<>();
//
//		for (Estudiante estudiante : itemsEstudiante) {
//
//			EstudianteMapper mapper = new EstudianteMapper();
//			mapper.setDniEstudiante(estudiante.getDniEstudiante());
////			mapper.setNombre(estudiante.getNombre());
////			mapper.setApellido(estudiante.getApellido());
////			mapper.setFnacimiento(estudiante.getFnacimiento());
//			mapper.setCelular(estudiante.getCelular());
//			mapper.setCorreo(estudiante.getCorreo());
//			mapper.setDireccion(estudiante.getDireccion());
//			// mapper.setPass(estudiante.getPass());
//			mapper.setEstado(estudiante.getEstado());
//			mapper.setCondicion(estudiante.getCondicion());
////			mapper.setDistrito(
////					new DistritoMapper(estudiante.getDistrito().getDistritoId(), estudiante.getDistrito().getNombre()));
////			mapper.setApoderado(new ApoderadoMapper(estudiante.getApoderado().getDniApoderado()));
//			itemsEstudianteMapper.add(mapper);
//		}
//		return itemsEstudianteMapper;
//	}
//
//	public static EstudianteMapper convert(Estudiante estudiante) {
//
//		EstudianteMapper mapper = new EstudianteMapper();
//		mapper.setDniEstudiante(estudiante.getDniEstudiante());
////		mapper.setNombre(estudiante.getNombre());
////		mapper.setApellido(estudiante.getApellido());
////		mapper.setFnacimiento(estudiante.getFnacimiento());
//		mapper.setCelular(estudiante.getCelular());
//		mapper.setCorreo(estudiante.getCorreo());
//		mapper.setDireccion(estudiante.getDireccion());
////		mapper.setPass(estudiante.getPass());
//		mapper.setEstado(estudiante.getEstado());
//		mapper.setCondicion(estudiante.getCondicion());
////		mapper.setDistrito(
//////				new DistritoMapper(estudiante.getDistrito().getDistritoId(), estudiante.getDistrito().getNombre()));
////		mapper.setApoderado(new ApoderadoMapper(estudiante.getApoderado().getDniApoderado()));
//		return mapper;
//
//	}
//
//	public static Asistencia convert(Map<String, ?> mapasistencia) {
//		Asistencia asistencia = new Asistencia();
//		asistencia.setAsistenciaId(Integer.parseInt(mapasistencia.get("asistencia_id").toString()));
//		asistencia.setEstado(Boolean.parseBoolean(mapasistencia.get("estado").toString()));
//		return asistencia;
//	}
//
//	// Map Estudiante a EstudianteLoginMapper
//	public static EstudianteLoginMapper convertEstudianteToEstudianteLogin(Map<String, ?> e) {
//		return new EstudianteLoginMapper(e.get("dni_estudiante").toString(), e.get("nombre").toString(),
//				e.get("apellido").toString(), e.get("fnacimiento").toString(), e.get("celular").toString(),
//				e.get("correo").toString(), e.get("direccion").toString(),
//				Integer.parseInt(e.get("distrito_id").toString()));
//	}
//
//	// Horario Map
//	public static Collection<HorarioDetalleMapper> convertDetalleHorario(Collection<Map<String, ?>> items) {
//
//		Collection<HorarioDetalleMapper> collection = new ArrayList<>();
//		for (Map<String, ?> map : items) {
//			collection.add(new HorarioDetalleMapper(Integer.parseInt(map.get("horario_detalle_id").toString()),
//					map.get("dia").toString(), map.get("hora_inicio").toString(), map.get("hora_fin").toString(),
//					Integer.parseInt(map.get("curso_id").toString()), map.get("nombre_curso").toString(),
//					Integer.parseInt(map.get("trabajador_id").toString())));
//		}
//
//		return collection;
//	}
//
//	// Map Estudiante a EstudianteLoginMapper + apoderado
//	public static EstudianteLoginMapper convertEstudianteToEstudianteLoginApoderado(Map<String, ?> e) {
//		EstudianteLoginMapper estudiante = new EstudianteLoginMapper(e.get("dni_estudiante").toString(),
//				e.get("nombre").toString(), e.get("apellido").toString(), e.get("fnacimiento").toString(),
//				e.get("celular").toString(), e.get("correo").toString(), e.get("direccion").toString(),
//				Integer.parseInt(e.get("distrito_id").toString()));
//		estudiante.setApoderado(e.get("apoderado").toString());
//		return estudiante;
//	}
//
//	public static Estudiante convertMapToEstudiante(Map<String, Object> e) {
//		return new Estudiante(e.get("dni_estudiante").toString(), e.get("nombre").toString(),
//				e.get("apellido").toString(), (Date) e.get("fnacimiento"), e.get("celular").toString(),
//				e.get("correo").toString(), e.get("direccion").toString(), e.get("pass").toString(),
//				(Boolean) e.get("estado"), e.get("condicion").toString());
//	}
//
//	// Mapper Collection<Object[]> a Collection<EstudianteMapper>
//	public static Collection<EstudianteMapper> convertCollObjects_EstudianteMapper(Collection<Object[]> objetos) {
//		Collection<EstudianteMapper> estudiantesMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			estudiantesMapper.add(convertObjectEstudiante(obj));
//		}
//
//		return estudiantesMapper;
//	}
//
//	// Mapper Object[] a EstudianteMapper
//	public static EstudianteMapper convertObjectEstudiante(Object[] obj) {
//		EstudianteMapper estudianteMapper = new EstudianteMapper();
//
//		estudianteMapper.setDniEstudiante((String) obj[0]);
//		estudianteMapper.setNombre((String) obj[1]);
//
//		return estudianteMapper;
//	}
//
//	public static Collection<NotaMapper> convertNotas(Collection<Notas> itemsNota) {
//
//		Collection<NotaMapper> itemsNotaMapper = new ArrayList<>();
//
//		for (Notas nota : itemsNota) {
//			NotaMapper mapper = new NotaMapper();
//			// mapper.setNota_id(nota.getNotaId());
//			mapper.setDni_estudiante(new EstudianteMapper(nota.getDniEstudiante().getDniEstudiante()));
//			mapper.setCursom(new CursoMapper(nota.getCurso().getCursoId(), nota.getCurso().getNombre()));
//			mapper.setNota1(nota.getNota1());
//			mapper.setNota2(nota.getNota2());
//			mapper.setNota3(nota.getNota3());
////			mapper.setFecha(nota.getFecha());
//			// n.nota_id, c.curso_id, e.dni_estudiante, n.fecha,
//			itemsNotaMapper.add(mapper);
//		}
//		return itemsNotaMapper;
//
//	}
//
//	public static List<DistritoMapper> convertD(List<Distrito> items) {
//		List<DistritoMapper> itemsDistritoMapper = new ArrayList<>();
//
//		for (Distrito distrito : items) {
//			DistritoMapper mapper = new DistritoMapper();
//			mapper.setDistritoId(distrito.getDistritoId());
//			mapper.setNombre(distrito.getNombre());
//
//			itemsDistritoMapper.add(mapper);
//		}
//
//		return itemsDistritoMapper;
//	}
//
//	/**
//	 * MAPPERS NOTA
//	 */
//
//	// Mapper Collection<Object[]> a Collection<NotaMapper>
//	public static Collection<NotaMapper> convertCollObjects_NotasMapper(Collection<Object[]> objetos) {
//		Collection<NotaMapper> notasMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			notasMapper.add(convertObjectNota(obj));
//		}
//
//		return notasMapper;
//	}
//
//	// Mapper Object[] a NotaMapper
//	public static NotaMapper convertObjectNota(Object[] obj) {
//		NotaMapper notaMapper = new NotaMapper();
//
//		notaMapper.setCurso((String) obj[0]);
//		notaMapper.setNota1((Integer) obj[1]);
//		notaMapper.setNota2((Integer) obj[2]);
//		notaMapper.setNota3((Integer) obj[3]);
//		// notaMapper.setFecha((String) obj[4]);
//
//		return notaMapper;
//	}
//
//	public static NotaMapper convert(Notas nota) {
//
//		NotaMapper mapper = new NotaMapper();
//		mapper.setCursom(new CursoMapper(nota.getCurso().getCursoId(), nota.getCurso().getNombre()));
//		mapper.setDni_estudiante(new EstudianteMapper(nota.getDniEstudiante().getDniEstudiante()));
//		mapper.setNota1(nota.getNota1());
//		mapper.setNota2(nota.getNota2());
//		mapper.setNota3(nota.getNota3());
////		mapper.setFecha(nota.getFecha());
//		return mapper;
//
//	}
//
//	
//
//	// MATRICULA
//	public static MatriculaMapper convert(Matricula matricula) {
//
//		MatriculaMapper mapper = new MatriculaMapper();
//		mapper.setEstudiante(new EstudianteMapper(matricula.getEstudiante().getDniEstudiante()));
//		mapper.setFecha(matricula.getFecha());
////		mapper.setNivel(matricula.getNivel());
////		mapper.setGrado(matricula.getGrado());
//		mapper.setSeccion(new SeccionMapper(matricula.getSeccion().getSeccionId(), matricula.getSeccion().getNombre()));
//		return mapper;
//	}
//
//	// SECCION
//	public static Collection<SeccionMapper> convertSeccion(Collection<Seccion> itemsSeccion) {
//
//		Collection<SeccionMapper> itemsSeccionMapper = new ArrayList<>();
//
//		for (Seccion seccion : itemsSeccion) {
//
//			SeccionMapper mapper = new SeccionMapper();
//			mapper.setSeccionId(seccion.getSeccionId());
//			mapper.setNombre(seccion.getNombre());
//			itemsSeccionMapper.add(mapper);
//		}
//		return itemsSeccionMapper;
//	}
//
//	/**
//	 * MAPPERS CURSO
//	 */
//
//	// Mapper Collection<Object[]> a Collection<CursoMapper>
//	public static Collection<CursoMapper> convertCollObjects_CursoMapper(Collection<Object[]> objetos) {
//		Collection<CursoMapper> cursosMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			cursosMapper.add(convertObjectCurso(obj));
//		}
//
//		return cursosMapper;
//	}
//
//	// Mapper Object[] a CursoMapper
//	public static CursoMapper convertObjectCurso(Object[] obj) {
//		CursoMapper cursoMapper = new CursoMapper();
//
//		cursoMapper.setCurso_id((Integer) obj[0]);
//		cursoMapper.setNombre((String) obj[1]);
//
//		return cursoMapper;
//	}
//
//	public static TrabajadorMapper convert(Trabajador trabajador) {
//
//		TrabajadorMapper mapper = new TrabajadorMapper();
//		mapper.setDni(trabajador.getDni());
//		mapper.setNombres(trabajador.getNombres());
//		mapper.setApellidos(trabajador.getApellidos());
//		mapper.setCorreo(trabajador.getCorreo());
//		mapper.setDireccion(trabajador.getDireccion());
////		mapper.setPass(trabajador.getPass());
//		mapper.setEstado(trabajador.getEstado());
////		mapper.setDistrito(
////				new DistritoMapper(trabajador.getDistrito().getDistritoId(), trabajador.getDistrito().getNombre()));
//		return mapper;
//
//	}
//
//	public static Collection<TrabajadorMapper> convertTrabajadores(Collection<Trabajador> itemsTrabajador) {
//
//		Collection<TrabajadorMapper> itemsTrabajadorMapper = new ArrayList<>();
//
//		for (Trabajador trabajador : itemsTrabajador) {
//
//			TrabajadorMapper mapper = new TrabajadorMapper();
//			mapper.setTrabajadorId(trabajador.getTrabajadorId());
//			mapper.setNombres(trabajador.getNombres());
//			mapper.setApellidos(trabajador.getApellidos());
//			mapper.setCargo(trabajador.getCargo());
//			mapper.setFechaNacimiento(trabajador.getFechaNacimiento());
//			mapper.setDni(trabajador.getDni());
//			mapper.setCelular(trabajador.getCelular());
//			mapper.setCorreo(trabajador.getCorreo());
//			mapper.setDireccion(trabajador.getDireccion());
//			mapper.setEstado(trabajador.getEstado());
////			mapper.setPass(trabajador.getPass());
////			mapper.setDistrito(
////					new DistritoMapper(trabajador.getDistrito().getDistritoId(), trabajador.getDistrito().getNombre()));
//			itemsTrabajadorMapper.add(mapper);
//		}
//		return itemsTrabajadorMapper;
//	}
//
//	public static Collection<TrabajadorMapper> convertTrabajadoresPorCurso(Collection<Trabajador> itemsTrabajador) {
//
//		Collection<TrabajadorMapper> itemsTrabajadorMapper = new ArrayList<>();
//
//		for (Trabajador trabajador : itemsTrabajador) {
//
//			TrabajadorMapper mapper = new TrabajadorMapper();
//			mapper.setTrabajadorId(trabajador.getTrabajadorId());
//			mapper.setNombres(trabajador.getNombres());
//			mapper.setApellidos(trabajador.getApellidos());
//			itemsTrabajadorMapper.add(mapper);
//		}
//		return itemsTrabajadorMapper;
//	}
//
//	public static Collection<SeccionMapper> convertSecciones(Collection<Seccion> itemsSeccion) {
//
//		Collection<SeccionMapper> itemsSeccionMapper = new ArrayList<>();
//
//		for (Seccion seccion : itemsSeccion) {
//
//			SeccionMapper mapper = new SeccionMapper();
//			mapper.setSeccionId(seccion.getSeccionId());
//			mapper.setNombre(seccion.getNombre());
//			mapper.setGrado(new GradoMapper(seccion.getGrado().getGradoId(), seccion.getGrado().getNombre(),
//					new NivelMapper(seccion.getGrado().getNivel().getNivelId())));
//			itemsSeccionMapper.add(mapper);
//		}
//		return itemsSeccionMapper;
//	}
//
//	/**
//	 * MAPPERS ASISTENCIA
//	 */
//
//	// Mapper Collection<Object[]> a Collection<AsistenciaMapper>
//	public static Collection<AsistenciaMapper> convertCollObjects_AsistenciaMapper(Collection<Object[]> objetos) {
//		Collection<AsistenciaMapper> asistenciaMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			asistenciaMapper.add(convertObjectAsistencia(obj));
//		}
//
//		return asistenciaMapper;
//	}
//
//	// Mapper Object[] a AsistenciaMapper
//	public static AsistenciaMapper convertObjectAsistencia(Object[] obj) {
//		AsistenciaMapper asistenciaMapper = new AsistenciaMapper();
//
//		asistenciaMapper.setEstado((Boolean) obj[0]);
//		LocalDate fehcaAumentada = LocalDate.parse(obj[1].toString());
//		asistenciaMapper.setFecha(fehcaAumentada.plusDays(1));
//
//		return asistenciaMapper;
//	}
//
//	// Listar Curso por Nivel y Grado
//	public static Collection<CursoMapper> convertCursosPorNivelGrado(Collection<Curso> itemsCurso) {
//
//		Collection<CursoMapper> itemsCursoMapper = new ArrayList<>();
//
//		for (Curso curso : itemsCurso) {
//
//			CursoMapper mapper = new CursoMapper();
//			mapper.setCurso_id(curso.getCursoId());
//			mapper.setNombre(curso.getNombre());
//			itemsCursoMapper.add(mapper);
//		}
//		return itemsCursoMapper;
//	}
//
//	/**
//	 * MAPPER NOTIFICACIONES
//	 */
//	public static Collection<NotificacionMapper> convertCollObjects_NotificacionMapper(Collection<Object[]> objetos) {
//		Collection<NotificacionMapper> notificacionesMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			NotificacionMapper notfMapp = new NotificacionMapper();
//
//			notfMapp.setIdNofiticacion((Integer) obj[0]);
//			notfMapp.setTitulo(obj[1].toString());
//			notfMapp.setTipo(obj[2].toString());
//			notfMapp.setFechaEnvio(obj[3].toString());
//			notfMapp.setDniEstudiante(obj[6].toString());
//			notfMapp.setDescripcion(obj[7].toString());
//
//			if (!notfMapp.getTipo().equals("comunicado")) {
//				notfMapp.setFechaLimite(obj[4].toString());
//				notfMapp.setEstado((Character) obj[5]);
//			}
//
//			notificacionesMapper.add(notfMapp);
//		}
//
//		return notificacionesMapper;
//	}
//
//	/**
//	 * MAPPER JUSTIFICACIONES
//	 */
//	public static Collection<JustificacionMapper> convertCollObjects_JustificacionMapper(Collection<Object[]> objetos) {
//		Collection<JustificacionMapper> justificacionesMapper = new ArrayList<>();
//
//		for (Object[] obj : objetos) {
//			JustificacionMapper jstfMapp = new JustificacionMapper();
//
//			jstfMapp.setJustificacionId((Integer) obj[0]);
//			jstfMapp.setTitulo(obj[1].toString());
//			jstfMapp.setFechaEnvio(obj[2].toString());
//			jstfMapp.setFechaJustificacion(obj[3].toString());
//			jstfMapp.setDniEstudiante(obj[4].toString());
//			jstfMapp.setDescripcion(obj[5].toString());
//
//			justificacionesMapper.add(jstfMapp);
//		}
//
//		return justificacionesMapper;
//	}
//
//	public static SeccionMapper convertOneSeccion(Seccion seccion) {
//
//		SeccionMapper mapper = new SeccionMapper();
//		mapper.setSeccionId(seccion.getSeccionId());
//		mapper.setNombre(seccion.getNombre());
//
//		return mapper;
//	}
//
//	/**
//	 * GRADO
//	 */
//	public static GradoMapper convertOneGrado(Grado grado) {
//
//		GradoMapper mapper = new GradoMapper();
//		mapper.setGrado_id(grado.getGradoId());
//		mapper.setNombre(grado.getNombre());
//
//		return mapper;
//	}
//
//	/**
//	 * NIVEL
//	 */
//	public static NivelMapper convertOneNivel(Nivel nivel) {
//
//		NivelMapper mapper = new NivelMapper();
//		mapper.setNivel_id(nivel.getNivelId());
//		mapper.setNombre(nivel.getNombre());
//
//		return mapper;
//	}
//
////HORARIO CABECERA
//	public static HorarioCabeceraMapper convertHorarioCabeceraId(HorarioCabecera horarioCabecera) {
//
//		HorarioCabeceraMapper mapper = new HorarioCabeceraMapper();
//		HorarioDetalleMapper mapperDetalle = new HorarioDetalleMapper();
//
////		mapper.setEstado(horarioCabecera.getEstado());
//		mapper.setSeccion(new SeccionMapper(horarioCabecera.getSeccion().getSeccionId()));
//		mapper.setTrabajador(new TrabajadorMapper(horarioCabecera.getTrabajador().getTrabajadorId()));
//		mapperDetalle.setHorarioCabecera(new HorarioCabeceraMapper(horarioCabecera.getHorarioCabeceraId()));
//		return mapper;
//
//	}
//
//	/*
//	 * CAMBIOS A LA FECHA 03/01/2021
//	 */
//	public static HorarioDetalleMapper convert(HorarioDetalle horariod) {
//
//		HorarioDetalleMapper mapper = new HorarioDetalleMapper();
//		mapper.setHorarioDetalleId(horariod.getHorarioDetalleId());
//		mapper.setDia(horariod.getDia());
//		mapper.setCurso(new CursoMapper(horariod.getCurso().getCursoId(), horariod.getCurso().getNombre()));
//		mapper.setTrabajador(new TrabajadorMapper(horariod.getTrabajador().getTrabajadorId()));
////		mapper.setHoraInicio(horariod.getHoraInicio());
////		mapper.setHoraFin(horariod.getHoraFin());
//		mapper.setHorarioCabecera(new HorarioCabeceraMapper(horariod.getHorarioCabecera().getHorarioCabeceraId()));
//		return mapper;
//
//	}
//
//	public static Collection<GradoMapper> convertGrados(Collection<Grado> itemsGrado) {
//
//		Collection<GradoMapper> itemsGradoMapper = new ArrayList<>();
//
//		for (Grado grado : itemsGrado) {
//
//			GradoMapper mapper = new GradoMapper();
//			mapper.setGrado_id(grado.getGradoId());
//			mapper.setNombre(grado.getNombre());
//			itemsGradoMapper.add(mapper);
//		}
//		return itemsGradoMapper;
//	}
//
//	/**
//	 * NIVEL
//	 */
//
//	public static Collection<NivelMapper> convertNiveles(Collection<Nivel> itemsNivel) {
//
//		Collection<NivelMapper> itemsNivelMapper = new ArrayList<>();
//
//		for (Nivel nivel : itemsNivel) {
//
//			NivelMapper mapper = new NivelMapper();
//			mapper.setNivel_id(nivel.getNivelId());
//			mapper.setNombre(nivel.getNombre());
//			itemsNivelMapper.add(mapper);
//		}
//		return itemsNivelMapper;
//	}
//
//	public static Collection<HorarioDetalleMapper> convertHorariosD(Collection<HorarioDetalle> itemshorariod) {
//
//		Collection<HorarioDetalleMapper> itemsHorarioDMapper = new ArrayList<>();
//		for (HorarioDetalle horariod : itemshorariod) {
//			HorarioDetalleMapper mapper = new HorarioDetalleMapper();
//			mapper.setHorarioDetalleId(horariod.getHorarioDetalleId());
//			mapper.setDia(horariod.getDia());
//			mapper.setCurso(new CursoMapper(horariod.getCurso().getCursoId(), horariod.getCurso().getNombre()));
//			mapper.setTrabajador(new TrabajadorMapper(horariod.getTrabajador().getTrabajadorId()));
////			mapper.setHoraInicio(horariod.getHoraInicio());
////			mapper.setHoraFin(horariod.getHoraFin());
//			mapper.setHorarioCabecera(new HorarioCabeceraMapper(horariod.getHorarioCabecera().getHorarioCabeceraId()));
//			itemsHorarioDMapper.add(mapper);
//		}
//		return itemsHorarioDMapper;
//
//	}
//
//	// Convertir Collection<Map> a Collection<Curso Mapper>
//	public static Collection<CursoMapper> convertMapToCollCursoMapper(Collection<Map<String, Object>> cursosDb) {
//		Collection<CursoMapper> cMappers = new ArrayList<>();
//		for (Map<String, Object> map : cursosDb) {
//			CursoMapper cMapper = new CursoMapper((int) map.get("curso_id"), map.get("nombre").toString());
//			cMappers.add(cMapper);
//		}
//
//		return cMappers;
//	}
//
//	// Convertir Collection<Map> a Collection<Trabajador Mapper>
//	public static Collection<TrabajadorMapper> convertCollMapToCollTrabajadorMapper(
//			Collection<Map<String, Object>> trabajador) {
//		Collection<TrabajadorMapper> tMappers = new ArrayList<>();
//		for (Map<String, Object> map : trabajador) {
//			TrabajadorMapper tMapper = new TrabajadorMapper((int) map.get("trabajador_id"),
//					map.get("nombres").toString(), map.get("apellidos").toString());
//			tMappers.add(tMapper);
//		}
//		return tMappers;
//	}
//
//	// Convertir Collection<Map> a Collection<Distrito Mapper>
//	public static Collection<DistritoMapper> convertCollMapToCollDistritoMapper(Collection<Map<String, ?>> distritos) {
//		Collection<DistritoMapper> dMappers = new ArrayList<>();
//		for (Map<String, ?> map : distritos) {
//			DistritoMapper dMappper = new DistritoMapper((Integer) map.get("distrito_id"),
//					map.get("nombre").toString());
//			dMappers.add(dMappper);
//		}
//
//		return dMappers;
//	}
//
//	public static Collection<NotificacionMapper> convertCollMapToCollNotificacionMapper(
//			Collection<Map<String, Object>> notificaciones) {
//		Collection<NotificacionMapper> tMappers = new ArrayList<>();
//		for (Map<String, ?> map : notificaciones) {
//			NotificacionMapper tMapper = new NotificacionMapper((Integer) map.get("notificacion_id"),
//					map.get("tipo").toString(), map.get("fecha_envio").toString(), map.get("titulo").toString(),
//					map.get("descripcion").toString(), map.get("dni_estudiante").toString());
//			if (!tMapper.getTipo().equals("comunicado")) {
//				tMapper.setFechaLimite(map.get("fecha_limite").toString());
//				tMapper.setEstado((Character) map.get("estado"));
//			}
//			tMappers.add(tMapper);
//		}
//		return tMappers;
//	}

}
