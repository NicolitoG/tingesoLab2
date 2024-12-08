package Tingeso2.Simulacion.services;

public class SimulacionService {



    public static void getAmount(int amountP, float interestRate, int years ){
        float monthlyInterestRate = (interestRate/12)/100;
        int totalPayNumber = years*12;
        float monthlyPayment = (float) (amountP * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayNumber)) /
                (Math.pow(1 + monthlyInterestRate, totalPayNumber) - 1));
        System.out.println("Monto a pagar mensualmente: " + monthlyPayment);
    }
}
