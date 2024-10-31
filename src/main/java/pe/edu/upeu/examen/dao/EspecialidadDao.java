package pe.edu.upeu.examen.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Especialidad;


public interface EspecialidadDao {
    Especialidad create(Especialidad e);
    Especialidad update(Especialidad e);
    void delete(Long id);
	Optional<Especialidad> read(Long id);
    List<Especialidad> readAll();
}
