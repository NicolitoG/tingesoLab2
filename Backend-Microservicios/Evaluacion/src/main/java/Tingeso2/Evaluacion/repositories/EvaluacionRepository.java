package Tingeso2.Evaluacion.repositories;

import Tingeso2.Evaluacion.entities.EvaluacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<EvaluacionEntity, Long>{
}
