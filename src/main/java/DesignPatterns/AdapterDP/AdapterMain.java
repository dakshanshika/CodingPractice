package DesignPatterns.AdapterDP;

public class AdapterMain {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentAdapter(new ExternalPaymentAPI1());
        paymentProcessor.pay(26000.00);


        PaymentProcessor pp = new PaymentAdapter(new ExternalPaymentAPI2());
        pp.pay(3200);
    }
}
