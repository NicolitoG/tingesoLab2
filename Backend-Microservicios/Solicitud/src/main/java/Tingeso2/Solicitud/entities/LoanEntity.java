package Tingeso2.Solicitud.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "loan")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private int type; // 1: primera vivienda, 2: segunda vivienda, 3: propiedades comerciales, 4: Remodelacion
    private int timeLimit; // 1: 30 años, 2: 20 años, 3: 25 años, 4: 15 años
    private float interestRate; // 1: 3.5-5.0%, 2: 4.0-6.0%, 3: 5.0-7.0%, 4: 4.5-6.0%
    private float maximumFinancingAmount;  // Monto maximo del financiamiento 1: 80%, 2: 70%, 3: 60%, 4: 50% de la propiedad
    private float MensualCuote; // Cuota mensual


}
