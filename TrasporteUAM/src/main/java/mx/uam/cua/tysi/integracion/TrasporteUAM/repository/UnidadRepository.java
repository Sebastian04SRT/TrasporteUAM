package mx.uam.cua.tysi.integracion.TrasporteUAM.repository;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Integer> {}