package pe.edu.upeu.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.dao.DoctorDao;
import pe.edu.upeu.examen.entity.Doctor;
import pe.edu.upeu.examen.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorDao doctorDao;

	@Override
	public Doctor create(Doctor d) {
		// TODO Auto-generated method stub
		return doctorDao.create(d);
	}

	@Override
	public Doctor update(Doctor d) {
		// TODO Auto-generated method stub
		return doctorDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		doctorDao.delete(id);
	}

	@Override
	public Optional<Doctor> read(Long id) {
		// TODO Auto-generated method stub
		return doctorDao.read(id);
	}

	@Override
	public List<Doctor> readAll() {
		// TODO Auto-generated method stub
		return doctorDao.readAll();
	}
	
}
