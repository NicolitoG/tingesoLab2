package Tingeso2.Solicitud.repositories;

import Tingeso2.Solicitud.entities.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long>{
}
