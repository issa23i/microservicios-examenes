package com.nttdata.microservicios.app.examenes.services;

import java.util.List;

import com.nttdata.microservicios.commons.examenes.models.entity.Asignatura;
import com.nttdata.microservicios.commons.examenes.models.entity.Examen;
import com.nttdata.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {
	public List<Examen> findByNombre(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();
	
	public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
