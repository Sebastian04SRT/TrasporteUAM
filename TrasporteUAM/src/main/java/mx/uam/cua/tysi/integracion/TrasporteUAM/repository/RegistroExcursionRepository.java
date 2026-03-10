package mx.uam.cua.tysi.integracion.TrasporteUAM.repository;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroExcursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RegistroExcursionRepository extends JpaRepository<RegistroExcursion, Integer> {}