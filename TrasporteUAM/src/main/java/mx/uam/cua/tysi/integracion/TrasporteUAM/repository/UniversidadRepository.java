package mx.uam.cua.tysi.integracion.TrasporteUAM.repository;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {}