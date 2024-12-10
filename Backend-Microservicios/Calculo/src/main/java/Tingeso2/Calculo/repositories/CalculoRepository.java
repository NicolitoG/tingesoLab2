package Tingeso2.Calculo.repositories;

import Tingeso2.Calculo.entities.CalculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculoRepository extends JpaRepository<CalculoEntity, Long>{

}
