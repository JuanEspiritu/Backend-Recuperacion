package pe.edu.upeu.examen.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Doctor;

public interface DoctorDao {
	Doctor create(Doctor d);
	Doctor update(Doctor d);
    void delete(Long id);
	Optional<Doctor> read(Long id);
    List<Doctor> readAll();
}
