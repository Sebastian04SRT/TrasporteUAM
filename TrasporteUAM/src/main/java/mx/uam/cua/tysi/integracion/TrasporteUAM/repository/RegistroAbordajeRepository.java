package mx.uam.cua.tysi.integracion.TrasporteUAM.repository;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroAbordaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RegistroAbordajeRepository extends JpaRepository<RegistroAbordaje, Integer> {}