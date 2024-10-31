package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.dao.DoctorDao;
import pe.edu.upeu.examen.entity.Doctor;
import pe.edu.upeu.examen.repository.DoctorRepository;

@Repository
public class DoctorDaoImpl implements DoctorDao{

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public Doctor create(Doctor d) {
		// TODO Auto-generated method stub
		return doctorRepository.save(d);
	}

	@Override
	public Doctor update(Doctor d) {
		// TODO Auto-generated method stub
		return doctorRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}

	@Override
	public Optional<Doctor> read(Long id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(id);
	}

	@Override
	public List<Doctor> readAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

}
