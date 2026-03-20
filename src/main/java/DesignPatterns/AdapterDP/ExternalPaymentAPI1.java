package DesignPatterns.AdapterDP;

public class ExternalPaymentAPI1 implements ExternalPaymentAPI {

    public void makePayment(double amount){
        System.out.println("payment is done using ExternalPaymentAPI1 : "+amount);
    }
}
