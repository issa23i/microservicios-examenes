package com.nttdata.microservicios.app.examenes.services;

import org.springframework.stereotype.Service;

import com.nttdata.microservicios.app.examenes.models.entity.Examen;
import com.nttdata.microservicios.app.examenes.models.repository.ExamenRepository;
import com.nttdata.microservicios.commons.services.CommonServiceImpl;
@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

}
