package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Doctor;

@Service
public interface DoctorService {
	Doctor create(Doctor d);
	Doctor update(Doctor d);
	void delete(Long id);
	Optional<Doctor> read(Long id);
	List<Doctor> readAll();
}
