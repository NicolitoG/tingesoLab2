package Tingeso2.Simulacion.repositories;

import Tingeso2.Simulacion.entities.SimulacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimulacionRepository extends JpaRepository<SimulacionEntity, Long>{
    SimulacionEntity findById(int id);
}
