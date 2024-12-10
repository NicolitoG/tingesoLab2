package Tingeso2.Seguimiento.repositories;

import Tingeso2.Seguimiento.entities.SeguimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguimientoRepository extends JpaRepository<SeguimientoEntity, Long>{
}
