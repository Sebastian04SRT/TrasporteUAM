package mx.uam.cua.tysi.integracion.TrasporteUAM.repository;


import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {}