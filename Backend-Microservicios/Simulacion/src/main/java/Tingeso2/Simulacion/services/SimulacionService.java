package Tingeso2.Simulacion.services;

import Tingeso2.Simulacion.entities.SimulacionEntity;
import Tingeso2.Simulacion.repositories.SimulacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class SimulacionService {

    public static float getAmount(int amountP, float interestRate, int years ){
        float monthlyInterestRate = (interestRate/12)/100;
        int totalPayNumber = years*12;
        float monthlyPayment = (float) (amountP * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayNumber)) /
                (Math.pow(1 + monthlyInterestRate, totalPayNumber) - 1));
        System.out.println("Monto a pagar mensualmente: " + monthlyPayment);
        return monthlyPayment;
    }
}
