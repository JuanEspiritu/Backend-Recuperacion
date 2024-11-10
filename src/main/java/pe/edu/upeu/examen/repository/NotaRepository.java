package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

}
