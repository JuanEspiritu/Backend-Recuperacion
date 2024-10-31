package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Especialidad;

@Service
public interface EspecialidadService {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Optional<Especialidad> read(Long id);
	List<Especialidad> readAll();

}
