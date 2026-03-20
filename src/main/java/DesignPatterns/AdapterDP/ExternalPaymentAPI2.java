package DesignPatterns.AdapterDP;

public class ExternalPaymentAPI2 implements ExternalPaymentAPI {

    public void makePayment(double amount){
        System.out.println("payment is done using ExternalPaymentAPI2 : "+amount);
    }
}
